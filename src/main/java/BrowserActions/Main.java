package BrowserActions;

public class Main {
    public static void main(String[] args) {
        BrowserActionExercise actions = new BrowserActionExercise();

        actions.navigateToGoogle();
        actions.navigateToJavaCodeGeeks();
        actions.goBack();
        actions.goBack();
        actions.refresh();
        actions.close();

    }
}
