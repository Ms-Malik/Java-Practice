public class JavaApplication6 {
    public static void main(String[] args) {
        Book b1=new Book("Untitled","Nameless");
        System.out.println(b1);
        Book b2=b1;
        b2.setAuthor("New Author");
        System.out.println(b1); 
        System.out.println(b2); 
        System.out.println(Book.identification); 
        Book b4=new Book(b2);
        System.out.println(b4);
        b2.setAuthor("ZZZ");
        System.out.println(b4);
        System.out.println(b2);
        System.out.println(b1.identification);
        System.out.println(b1.id);
        System.out.println(Book.identification);
           }}