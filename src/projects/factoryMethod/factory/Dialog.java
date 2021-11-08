package projects.factoryMethod.factory;

import projects.factoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        /**
         Integrar código que haga mas funcioanlidades.
         */

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Las subclases van a implementar este método pero con su propia especificación.
     */
    public abstract Button createButton();
}
