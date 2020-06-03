import java.util.ArrayList;

public class ApplicationMediator implements Mediator{

    private ArrayList<Colleague> colleagues;
    private ColleagueFactory colleagueFactory;

    public ApplicationMediator() {
        colleagues = new ArrayList<Colleague>();
        colleagueFactory = new ColleagueFactory();
    }

    public void addColleague(Colleague colleague){
        colleagues.add(colleague);
    }

    public void removeColleague(Colleague colleague){
        colleagues.remove(colleague);
    }

    public void send(String message, Colleague originator) {
        //
    }



    @Override
    public void send(String message, Colleague colleague) {

        //let all other screens know that this screen has changed

        if (message == "add bot"){
            addColleague(colleagueFactory.getColleague("bot", this::send));
        }
        for (Colleague colleague:colleagues){
            //don't tell ourselves
            if (colleague!=originator && colleague.getClass() == BotColleague.class)){
        colleague.receive(message);
        }else if (colleague !=originator && colleague.getClass() == BotColleague.class){
        if (message == "cat") {
            this.removeColleague(originator);
        }else{
            colleague.receive(message);
        }
            }
        }

    }
}
