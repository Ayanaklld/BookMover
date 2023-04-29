package BookMover;

public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED -> {
                book.setStatus(Status.ARCHIVED);
                System.out.println("Вы успешно перевели книгу из статуса " + Status.AVAILABLE + " в статус " + book.getStatus());
            }
            case BORROWED -> {
                book.setStatus(Status.BORROWED);
                System.out.println("Вы успешно перевели книгу из статуса " + Status.AVAILABLE + " в статус " + book.getStatus());
            }
            case AVAILABLE -> System.out.println("Книга уже находится в статусе " + Status.AVAILABLE);
            case OVERDUED -> System.out.println("Перевод книги из статуса " + Status.AVAILABLE + " в статус " + Status.OVERDUED + " невозможен");
            default -> System.out.println("Перевод невозможен!");
        }
    }
}
