import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Book
 */
public class Book {

    private int bookId;
    private String title;
    private String Author;
    private int qty;
    private int price;

    public Book(int bookId, String title, String author, int qty, int price) {
        this.bookId = bookId;
        this.title = title;
        Author = author;
        this.qty = qty;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class intern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<Book>();
        System.out.println("enter option number for perform operation");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                String title, author;
                int bookId, price, qty;
                System.out.println("enter book title");
                title = sc.next();
                System.out.println("enter book author");
                author = sc.next();
                System.out.println("enter book bookid");
                bookId = sc.nextInt();
                System.out.println("enter book price");
                qty = sc.nextInt();
                System.out.println("enter book qty");
                price = sc.next();
                books.add(new Book(bookId, title, author, qty, price));
                break;
            case 2:
                System.out.println(books);
            case 3:
                int bId;
                bookId = sc.nextInt();
                for (Book book : books) {
                    if (book.getBookId() == bookId) {
                        System.out.println(book);
                    }
                }
            case 4:
                int btitle;
                btitle = sc.nextInt();
                for (Book book : books) {
                    if (book.getTitle() == btitle) {
                        System.out.println(book);
                    }
                }

            default:
                break;
        }

    }
}