package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Models.Artist;
import Models.Song;
import Query.Constants;
import Query.Queries;

public class UserInterface extends javax.swing.JFrame {
	
	private JFrame frame;
	
	private JMenuBar menu;
	
	private JLabel artist;
	private JLabel dates;
	private JLabel totalAlbums;
	private JLabel totalSongs;
	
	private String artistName;
	private String Dates;
	private String albums;
	private String songs;
	
	private JList<Artist> artistList = new JList<Artist>();
	private JList<Song> songList = new JList<Song>();	
	
	Queries query;
	
	public UserInterface() throws SQLException {
		initData();
		initUI();
	}
	
	public void initUI() throws SQLException {
		frame = new JFrame("Music Database");
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);

		menu = new JMenuBar();
		menu.setSize(1000, 20);
		JMenuItem songs = new JMenuItem("Songs");
		songs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Show/Sort by songs here
				System.out.println("Here!");
			}
		});
		JMenuItem playlists = new JMenuItem("Playlists");
		playlists.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Show/Sort by playlists here
			}
		});
		JMenuItem artists = new JMenuItem("Artists");
		artists.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Show/sort by artists here
			}
		});
		JMenuItem albums = new JMenuItem("Albums");		
		albums.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Show/sort by albums
			}
		});
		
		menu.add(artists);
		menu.add(songs);
		menu.add(playlists);
		menu.add(albums);
		
		frame.add(menu);
				
		JPanel newPanel = new JPanel(new GridBagLayout());
		newPanel.setBackground(Color.BLUE);
		newPanel.setBounds(400, 20, 400, 100);
		GridBagConstraints con = new GridBagConstraints();
		
		artist = new JLabel("Artist");
		dates = new JLabel("3/12/2015 - 3/16/2016");
		totalAlbums = new JLabel("10 albums");
		totalSongs = new JLabel("Total Songs");
		
		con.gridx = 0;
		con.gridy = 0;
		
		newPanel.add(artist, con);
		
		con.weighty = 0;
		con.gridx = 0;
		con.gridy = 1;
		newPanel.add(dates, con);
		
		con.weighty = 0;
		con.gridx = 0;
		con.gridy = 2;
		newPanel.add(totalAlbums, con);
		
		con.gridx = 0;
		con.gridy = 3;
		newPanel.add(totalSongs, con);
		
		frame.add(newPanel);
		
		artistList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		artistList.setSelectedIndex(0);
		artistList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				Artist art = artistList.getSelectedValue();
				try {
					getArtistData(art);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		JScrollPane artistPane = new JScrollPane(artistList);
		artistPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		artistPane.setBounds(0, 20, 300, 800);
		
		frame.add(artistPane);
				
		songList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		songList.setSelectedIndex(0);
		JScrollPane albumSongPane = new JScrollPane(songList);
		albumSongPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		albumSongPane.setBounds(400, 120, 395, 800);
		
		frame.add(albumSongPane);
		frame.setVisible(true);
	}
	
	/*
	 * This will be used to query and fill in values for Artist JList
	 */
	private void initData() throws SQLException {
		DefaultListModel<Artist> model = new DefaultListModel<Artist>();

		query = new Queries();
		
		Connection c = query.openDatabase();
		
		ResultSet artistSet = query.queryDatabase(c, Constants.GETALLARTISTS);
		
		while(artistSet.next()) {
			Artist a = new Artist();
			a.setName(artistSet.getString("name"));
			a.setArtId(artistSet.getInt("artid"));
			
			model.addElement(a);
		}
		
		artistList.setModel(model);
		artistSet.close();
		query.closeDatabase(c);
	}
	
	private void getArtistData(Artist art) throws SQLException {
		DefaultListModel<Song> model = new DefaultListModel<Song>();
		
		query = new Queries();
		
		Connection c = query.openDatabase();
		
		ResultSet artistSongs = query.queryDatabase(c, "SELECT * FROM SONGS "
				+ "WHERE artid=" + art.getArtId() + " ORDER BY albumTitle ORDER BY trackNum");

		while(artistSongs.next()) { 
			Song song = new Song();
			song.setMid(artistSongs.getInt("mid"));
			song.setMediaType(artistSongs.getString("mediaType"));
			song.setArtId(artistSongs.getInt("artid"));
			song.setAlbumTitle(artistSongs.getString("albumTitle"));
			song.setTrackNum(artistSongs.getInt("trackNum"));
			song.setTitle(artistSongs.getString("title"));
			song.setGenre(artistSongs.getString("genre"));
			song.setDuration(artistSongs.getInt("duration"));
			song.setReleaseDate(artistSongs.getDate("releaseDate"));
			song.setRecordDate(artistSongs.getDate("recordDate"));
			
			model.addElement(song);
		}
		
		songList.setModel(model);
		artistSongs.close();
		query.closeDatabase(c);
	}
		
	public static void main(String[] args) throws SQLException {
		
		UserInterface ui = new UserInterface();

	}

}
