package BookMover;

public class FromOverduedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        book.setStatus(Status.OVERDUED);
        switch (requestedStatus) {
            case ARCHIVED -> {
                book.setStatus(Status.ARCHIVED);
                System.out.println("Вы успешно перевели книгу из статуса " + Status.OVERDUED + " в статус " + book.getStatus());
            }
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE);
                System.out.println("Вы успешно перевели книгу из статуса " + Status.OVERDUED + " в статус " + book.getStatus());
            }
            default -> System.out.println("Перевод невозможен!");
        }
    }
}
