package ming.a211_stia1123_asgn1_285824;
// OOI YAU MING
// 285824
public class Door {
        int width;
        int height;
    
    //constructor    
    Door(int a, int b){
        width = a ;
        height = b;
}
    //print all the value of width and height for each door 
    public void ShowDoor(int a){
        System.out.println("Door " + a + " : width = " + width + " height = " + height);
    
}
    //edit new value in the door that choose
    public void EditDoor(int b, int c){ 
        width = b;
        height = c;
}
}