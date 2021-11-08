package projects.factoryMethod.factory;

import projects.factoryMethod.buttons.Button;
import projects.factoryMethod.buttons.MacButton;

public class MacDialog extends Dialog {

    @Override
    public Button createButton() {
        return new MacButton();
    }

}
