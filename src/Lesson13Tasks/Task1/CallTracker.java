package Lesson13Tasks;

public class CallTracker {
    private Integer calledTimes;
    private static CallTracker callTracker = null;

    private CallTracker() {
        calledTimes = 0;
    }

    public static synchronized CallTracker getInstance() {
        if (callTracker == null)
            callTracker = new CallTracker();

        return callTracker;
    }

    public void increment() {

    }
}
