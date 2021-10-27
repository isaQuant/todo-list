import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Date dueDate;
    private Status status;

    /**
     * Constructor, only the title is needed for creating a task.
     * Status is always OPEN when creating a task
     * @param title
     */
    public Task(String title) {
        this.title = title;
        this.status = Status.OPEN;
    }

    public Status getStatus() {
        return status;
    }

    /*** Getter and Setter ***/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Prints title, due date and description of the task
     */
    public void printTask() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("DueDate: " + this.getDueDate());
        System.out.println("Description: " + this.getDescription());
    }
}
