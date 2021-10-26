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
     * Entfernt
     */

    public static void clearList() {

    }

}
