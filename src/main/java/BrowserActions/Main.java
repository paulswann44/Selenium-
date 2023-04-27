package BrowserActions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BrowserActionExercise actions = new BrowserActionExercise();
        actions.setTime(4000); // Set delay time to 3 seconds

        actions.navigateToGoogle();
        Thread.sleep(actions.getTime());
        actions.navigateToJavaCodeGeeks();
        Thread.sleep(actions.getTime());
        actions.goBack();
        Thread.sleep(actions.getTime());
        actions.getTitle();
        Thread.sleep(actions.getTime());
        actions.getCurrentUrl();
        Thread.sleep(actions.getTime());
        actions.goBack();
        Thread.sleep(actions.getTime());
        actions.refresh();
        Thread.sleep(actions.getTime());
        actions.close();
    }
}