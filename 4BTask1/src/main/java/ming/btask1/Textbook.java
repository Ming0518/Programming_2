package ming.btask1;

public class Textbook extends Book{
    private String AuthorName;
    
    public Textbook(String t, int p, String a){
        super(t,p);
        AuthorName = a;
    
}
    public String getAuthorName(){
        return AuthorName;
    }
    
    public String toString()
  {
      return super.getTitle() + " " +  super.getPages() + " " + AuthorName;
  }
}