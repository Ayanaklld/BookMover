package BookMover;

public class Main {
    public static void main(String[] args) {
//        Book book = new Book("The Lord of the Rings", Status.AVAILABLE);
//        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
//        fromAvailableStatusMover.moveToStatus(book, Status.OVERDUED);
//        System.out.println(book.getStatus());

        Book book = new Book("1984");
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        fromBorrowedStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus());

//          Book book = new Book("Atomic habits");
//          BookMover fromArchivedStatusMover = new FromArchievedStatusMover();
//          fromArchivedStatusMover.moveToStatus(book, Status.BORROWED);
//          System.out.println(book.getStatus());

//            Book book = new Book("Sapiens");
//            BookMover fromOverduedStatusMover = new FromOverduedStatusMover();
//            fromOverduedStatusMover.moveToStatus(book, Status.AVAILABLE);
//            System.out.println(book.getStatus());


    }
}
