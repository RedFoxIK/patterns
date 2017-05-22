package creational.singletone;

public class Controller {
    private static Controller controller;

    private Controller() {}

    public static Controller getController() {
        if ( controller == null ) {
            controller = new Controller();
        }
        return controller;
    }
}
