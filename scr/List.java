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
    public static void addTask(Task t) {

    }

    /**
     * Removes a task from the list
     * @param t = the task to be removed
     */
    public static void removeTask(Task t) {

    }

    //TODO: Add methods for changing the status




}
