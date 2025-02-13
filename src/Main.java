public class Main{
    public static void main(String[] args) {
        PrintedBook b1 = new PrintedBook("Harry Potter", "J. Roaling", 2025, 100, "Some Good Publisher");

        PrintedBook b2 = new PrintedBook("Harry Potter", "J. Roaling", 2024, 100);
        
        System.out.println(b1.getBookInfo());
        System.out.println(b1.bookPrice());
        System.out.println(b2.getBookInfo());
        System.out.println(b2.bookPrice());
    }
}
