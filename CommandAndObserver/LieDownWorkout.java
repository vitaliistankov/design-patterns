package commandObserver;

public class LieDownWorkout  implements Workout {
    private Trained trained;

    LieDownWorkout(Trained trained) {
        this.trained = trained;
    }

    @Override
    public void execute() {
        trained.lieDown();
    }
}
