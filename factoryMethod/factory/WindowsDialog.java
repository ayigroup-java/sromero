package projects.factoryMethod.factory;

import projects.factoryMethod.buttons.Button;
import projects.factoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
