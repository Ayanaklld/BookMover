package BookMover;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        book.setStatus(Status.BORROWED);
        switch (requestedStatus) {
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE);
                System.out.println("Вы успешно перевели книгу из статуса " + Status.BORROWED + " в статус " + book.getStatus());
            }
            case ARCHIVED -> {
                book.setStatus(Status.ARCHIVED);
                System.out.println("Вы успешно перевели книгу из статуса " + Status.BORROWED + " в статус " + book.getStatus());
            }
            case OVERDUED -> {
                book.setStatus(Status.OVERDUED);
                System.out.println("Вы успешно перевели книгу из статуса " + Status.BORROWED + " в статус " + book.getStatus());
            }
            case BORROWED -> System.out.println("Книга уже находится в статусе " + book.getStatus());
            default -> System.out.println("Перевод невозможен!");
        }
    }
}
