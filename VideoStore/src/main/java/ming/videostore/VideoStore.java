
package ming.videostore;

public class VideoStore
{
  public static void main ( String args[] )
  {
    Video item1 = new Video("Microcosmo", 90 );
    Movie item2 = new Movie("Jaws", 120 , "Spelberg", "PG");
    Movie item3 = new Movie("Jumanji", "Ray", "13above"); 
    
    item1.show();
    item2.show();
    item3.show();
  }
}

class Video
{
  private String  title;    // name of the item
  private int     length;   // number of minutes
  private boolean avail;    // is the video in the store?

  // constructor
  public Video( String ttl )
  {
    title = ttl; length = 90; avail = true; 
  }

  // constructor
  public Video( String ttl, int lngth )
  {
    title = ttl; length = lngth; avail = true; 
  }

  public void show()
  {
   System.out.println(title + ", " + length + " min. available:" + avail );
  }
}

class Movie extends Video
{
  private String  director;     // name of the director
  private String  rating;       // U, SG, SX

  // constructor
  public Movie( String ttl, int lngth, String dir, String rtng )
  {
    super( ttl, lngth );            //use the super class's constructor
    director = dir;  rating = rtng; 
  }
  
  public Movie( String ttl, String dir, String rtng )
{
  super( ttl );    // invoke the matching parent class constructor  
  director = dir;  rating = rtng;     // initialize members unique to Movie
}
  
  public void show()
  {
      super.show();
   System.out.println("director: " + director + " rating:" + rating);
  }
}