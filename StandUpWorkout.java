package commandObserver;

public class StandUpWorkout implements Workout
{
    private Trained trained;

    StandUpWorkout(Trained trained) {
        this.trained = trained;
    }

    @Override
    public void execute() {
        trained.standUp();
    }
}
