package BookMover;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(b1, Status.ARCHIVED);
        System.out.println(b1.getStatus());
        System.out.println(" ");

        BookMover fromArchivedStatusMover = new FromArchievedStatusMover();
        fromArchivedStatusMover.moveToStatus(b1, Status.AVAILABLE);
        System.out.println(b1.getStatus());
        System.out.println(" ");

        BookMover fromAvailableStatusMover1 = new FromAvailableStatusMover();
        fromAvailableStatusMover1.moveToStatus(b1, Status.BORROWED);
        System.out.println(b1.getStatus());
        System.out.println(" ");

        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        fromBorrowedStatusMover.moveToStatus(b1, Status.OVERDUED);
        System.out.println(b1.getStatus());
        System.out.println(" ");

        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();
        fromOverduedStatusMover.moveToStatus(b1, Status.AVAILABLE);
        System.out.println(b1.getStatus());
        System.out.println(" ");
    }
}
