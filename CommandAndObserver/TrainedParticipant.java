package commandObserver;

import java.util.ArrayList;
import java.util.List;

public class TrainedParticipant extends Trained implements Observable, Commaner {
    private List<TrainedWatcher> watchers = new ArrayList<>();

    TrainedParticipant(String name) {
        super(name);
    }

    @Override
    void lieDown() {
        super.lieDown();
        notifyObservers();
    }

    @Override
    void standUp() {
        super.standUp();
        notifyObservers();
    }

    @Override
    public void subscribe(TrainedWatcher observer) {
        watchers.add(observer);
    }

    @Override
    public void unsubscribe(TrainedWatcher observer) {
        watchers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        switch (this.state) {
            case "Up":
                watchers.forEach(watcher -> this.executeWorkout(new StandUpWorkout(watcher)));
                break;
            case "Down":
                watchers.forEach(watcher -> this.executeWorkout(new LieDownWorkout(watcher)));
        }
    }

    @Override
    public void executeWorkout(Workout workout) {
        workout.execute();
    }
}
