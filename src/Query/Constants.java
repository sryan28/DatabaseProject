package Query;

/*
 * Constants for querying an entire table of the database without filtering
 */

public class Constants {
	
	private final static String GETALLSONGS = "SELECT * FROM song ORDER BY title";
	private final static String GETALLARTISTS = "SELECT * FROM artist ORDER BY name";
	private final static String GETALLEPISODES = "SELECT * FROM episode ORDER BY epname";
	private final static String GETALLSEASONS = "SELECT * FROM season ORDER BY tvTitle";
	private final static String GETALLMOVIES = "SELECT * FROM movie ORDER BY mName";
	private final static String GETALLPLAYLISTS = "SELECT * FROM playlist ORDER BY name";
	private final static String GETALLMEDIA = "SELECT * FROM media ORDER BY mid";
	private final static String GETALLCUSTOMERS = "SELECT * FROM customer";
	private final static String GETALLALBUMS = "SELECT *FROM album ORDER BY artid";
	private final static String GETALLNETWORKS = "SELECT * FROM network ORDER BY networkName";
	private final static String GETALLTVSERIES = "SELECT * FROM tvseries ORDER BY tvTitle";
	private final static String GETALLSTUDIOS = "SELECT * FROM studio ORDER BY studioName";
	private final static String GETALLACTORS = "SELECT * FROM actor ORDER BY name";
			
}
