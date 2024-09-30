
package ming.demobook;

public class Textbook extends Book{
    private String AuthorName;
    
    public Textbook(String t, int p, String a){
        super(t,p);
        AuthorName = a;
    
}
    public String getTitle(){
        return super.getTitle();
}
     public int getPages(){
        return super.getPages();
}
    public String getAuthorName(){
        return AuthorName;
    }
}
