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
    public static void removeTask(Task t) throws Exception {
        if(!List.containsTask(t)) {
            throw new Exception("Task is not on the task list");
        } else {
            taskList.remove(t);
        }
    }

    /**
     * Sets the status of the task to DONE
     * @param t = the task
     */
    public static void setDone(Task t) {
        t.setStatus(Status.DONE);
    }

    /**
     * Sets the status of the task to OPEN
     * @param t = the task
     */

    public static void setOPEN(Task t) {
        t.setStatus(Status.OPEN);
    }


    /**
     * Checks if the given task is contained in the task list
     * @param t = the task
     * @return true if the task is contained in the task list, else returns false
     */

    private static boolean containsTask(Task t) {
        for(Task task : taskList) {
            if(task.equals(t)) {
                return true;
            }
        }
        return false;
    }




}
