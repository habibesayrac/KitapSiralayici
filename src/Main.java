import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Çalıkuşu",200,"Reşat Nuri","1967");
        Book book2 = new Book("Cin Ali" , 58,"Raşit ","1988");
        Book book3 = new Book("Harry Potter", 544,"Harry ","2000");
        Book book4 = new Book("Aslan",122,"asedde","2022");
        Book book5 = new Book("Alice",79,"Wonderland","1999");


        TreeSet<Book> bookSet = new TreeSet<>();

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        for (Book book:bookSet) {
            System.out.printf("Book Name: %-23s Page: %4d\n", book.getBookName(), book.getBookPage());
        }

        TreeSet<Book> bookSetPageNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getBookPage() - b2.getBookPage();
            }
        }.reversed());

        bookSetPageNum.add(book1);
        bookSetPageNum.add(book2);
        bookSetPageNum.add(book3);
        bookSetPageNum.add(book4);
        bookSetPageNum.add(book5);

        for (Book book:bookSetPageNum) {
            System.out.printf("Book Name: %-23s Page: %4d\n", book.getBookName(), book.getBookPage());
        }

    }
}
