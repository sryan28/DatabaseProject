package Query;

/*
 * Constants for querying an entire table of the database without filtering
 */

public class Constants {
	
	public final static String GETALLSONGS = "SELECT * FROM song ORDER BY title";
	public final static String GETALLARTISTS = "SELECT * FROM artist ORDER BY name";
	public final static String GETALLEPISODES = "SELECT * FROM episode ORDER BY epname";
	public final static String GETALLSEASONS = "SELECT * FROM season ORDER BY tvTitle";
	public final static String GETALLMOVIES = "SELECT * FROM movie ORDER BY mName";
	public final static String GETALLPLAYLISTS = "SELECT * FROM playlist ORDER BY name";
	public final static String GETALLMEDIA = "SELECT * FROM media ORDER BY mid";
	public final static String GETALLCUSTOMERS = "SELECT * FROM customer";
	public final static String GETALLALBUMS = "SELECT *FROM album ORDER BY artid";
	public final static String GETALLNETWORKS = "SELECT * FROM network ORDER BY networkName";
	public final static String GETALLTVSERIES = "SELECT * FROM tvseries ORDER BY tvTitle";
	public final static String GETALLSTUDIOS = "SELECT * FROM studio ORDER BY studioName";
	public final static String GETALLACTORS = "SELECT * FROM actor ORDER BY name";
			
}
