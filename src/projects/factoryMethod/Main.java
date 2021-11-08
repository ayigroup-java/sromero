package projects.factoryMethod;

import projects.factoryMethod.factory.Dialog;
import projects.factoryMethod.factory.HtmlDialog;
import projects.factoryMethod.factory.MacDialog;
import projects.factoryMethod.factory.WindowsDialog;

public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {

        System.out.println("OS: " + System.getProperty("os.name"));

        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new MacDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}