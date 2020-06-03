public class ColleagueFactory {

    public Colleague getColleague(String type, Mediator m) {
        if (type == "bot") {
            return new BotColleague(m);
        } else if
            (type == "human") {
                return new ConcreteColleague(m);
            }
            return null;
        }
    }

