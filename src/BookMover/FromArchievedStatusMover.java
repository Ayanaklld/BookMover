package BookMover;


//вариант покороче
public class FromArchievedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        book.setStatus(Status.ARCHIVED);
        switch (requestedStatus) {
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE);
                System.out.println("Вы успешно перевели книгу из статуса " + Status.ARCHIVED + " в статус " + book.getStatus());
            }
            default -> System.out.println("Перевод невозможен!");
        }
    }
}
