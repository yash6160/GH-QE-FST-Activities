abstract class Book{
    String title;
    abstract void  setTitle(String title);
    public String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    public void setTitle(String title){
        this.title=title;
    }
}
public class Activity5 {

    public static void main(String [] args){
        MyBook mb=new MyBook();
        mb.setTitle("Miracle Morning");
        System.out.print(mb.getTitle());
    }
    
}
