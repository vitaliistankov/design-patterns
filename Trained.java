package commandObserver;

public abstract class Trained {
    private String name;
    protected String state = "Up";

    Trained(String name) {
        this.name = name;
    }

    void lieDown() {
        this.state = "Down";
        getCurrentState();
    }

    void standUp() {
        this.state = "Up";
        getCurrentState();
    }

    private void getCurrentState() {
        System.out.println(name + " " + state);
    }
}
