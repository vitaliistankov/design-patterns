public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator m) {
        mediator = m;
    }

    //sending a message via the mediator

    public void send(String message, Colleague colleague){
        mediator.send(message, this);
    }


    //get access to the mediator


    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);
}
