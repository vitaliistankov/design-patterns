public class BotColleague extends  Colleague{


    public BotColleague(Mediator m) {
        super(m);
    }

    @Override
    public void receive(String message) {

        System.out.println("Colleague received" + message);

    }
}
