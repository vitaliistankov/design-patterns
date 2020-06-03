public class Main {

    public static void main(String[] args){
        ColleagueFactory colleagueFactory = new ColleagueFactory();
        ApplicationMediator mediator = new ApplicationMediator();
        ConcreteColleague desktop = colleagueFactory.getColleague("human", mediator);
        ConcreteColleague mobile = colleagueFactory.getColleague("human", mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello World!");
        mobile.send("Hello");

    }
}
