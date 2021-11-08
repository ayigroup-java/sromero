package projects.factoryMethod.factory;

import projects.factoryMethod.buttons.Button;
import projects.factoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
