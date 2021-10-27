import java.util.ArrayList;

/**
 * List which manages the tasks
 * There can only be one list
 */


public class List {
    private static List instance;

    private static ArrayList<Task> taskList = new ArrayList<Task>();

    private List() {
    }

    public static List getInstance() {
        if (instance == null) {
            instance = new List();
        }
        return instance;
    }


    /**
     * Removes all tasks from the list
     */
    public static void clearList() {
        taskList.clear();
    }

    /**
     * Adds a task to the task list
     * @param t = the task
     */
    static void addTask(Task t) {
        taskList.add(t);
    }

    /**
     * Removes a task from the list (it will be deleted)
     * @param t = the task to be removed
     */
    public static void removeTask(Task t) {

    }

    /**
     * Sets the status of the task to DONE
     * @param t = the task
     */
    public static void setDone(Task t) {

    }

    /**
     *
     * @param t = the task
     */

    public static void setOPEN(Task t) {

    }




}
