import java.util.Scanner;

class Library {

    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addbook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;

    }

    void showavailablebooks() {
        System.out.println("Available books are");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issuebook(String book) {

        for (int i = 0; i < this.books.length; i++) {

            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("The Book has been issued!");
                this.books[i] = null;
                return;
            }
            System.out.println("* " + book);
        }
        System.out.println("This book doesn't Exist.");
    }

    void returnBook(String book) {
        addbook(book);

    }

}

public class Online_library {
    public static void main(String[] args) {

        /*
         * You have to implement a library using java class "OnlineLibrary"
         * // Methods: addbook , issuebook, returnbook, showavailablebooks
         * //Properties : Array to store the available books, array to store issued
         * books
         * 
         */
        System.out.println("Welcome to the Online Library");
        Library cenLibrary = new Library();
        cenLibrary.addbook("Computer Fundamentals");
        cenLibrary.addbook("C Programming.");
        cenLibrary.addbook("Basic Mathematics");
        cenLibrary.addbook("Data Structure Using C");
        cenLibrary.addbook("Introduction to Database System");
        cenLibrary.addbook("Java");
        cenLibrary.addbook("Numerical Analysis");
        cenLibrary.addbook("Frouzen");
        cenLibrary.addbook("Discreate Mathematics");
        Scanner sc = new Scanner(System.in);
        String book;
        int choice;

        do {
            System.out.println("++++++++++++++++++++ Options Available +++++++++++++++");
            System.out.println("1  Add Book.");
            System.out.println("2  Show Available Books.");
            System.out.println("3  Issue Books.");
            System.out.println("4  Return Book.");
            System.out.println("5  Exit.");
            System.out.print("\nEnter your Choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Book name Which you want to add : ");
                    book = sc.nextLine();
                    cenLibrary.addbook(book);
                    break;
                case 2:
                    cenLibrary.showavailablebooks();
                    break;
                case 3:
                    System.out.println("Enter the Book name which you want to issue : ");
                    book = sc.nextLine();
                    cenLibrary.issuebook(book);
                    break;
                case 4:
                    System.out.print("Enter the name of Book which you want to return : ");
                    book = sc.nextLine();
                    cenLibrary.returnBook(book);
                    break;
                case 5:
                    System.out.println("Exiting the Library Good Bye.");
                    break;
                default:
                    System.out.println("Invalid Choice Please Select a Valid choice(1-5).");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}
