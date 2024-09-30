package ming.btask1;

public class DemoBook {
    public static void main(String[] args) {
                Book book1 = new Book("Programming 2",120);
        Textbook book2 = new Textbook("Intro programming",112, "Juliana");
        
        System.out.println(book1);
        System.out.println("Title = " + book1.getTitle());
        System.out.println("Page Number = " + book1.getPages());
        
        System.out.println(book2);
        System.out.println("Title = " + book2.getTitle());
        System.out.println("Page Number = " + book2.getPages());
        System.out.println("Author Name = " + book2.getAuthorName());
    }
}

