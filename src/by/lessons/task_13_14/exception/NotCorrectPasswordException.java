package by.lessons.task_13_14.exception;

public class NotCorrectPasswordException  extends RuntimeException{
    public NotCorrectPasswordException(String message) {
        super(message);
    }
}
