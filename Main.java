package commandObserver;

public class Main {

    public static void main(String[] args) {
	    Couch couch = new Couch();
	    TrainedParticipant example = new TrainedParticipant("Valera");
	    TrainedWatcher watcher1 = new TrainedWatcher("Watcher 1");
	    TrainedWatcher watcher2 = new TrainedWatcher("Watcher 2");
	    TrainedWatcher watcher3 = new TrainedWatcher("Watcher 3");

		example.subscribe(watcher1);
		example.subscribe(watcher2);
		example.subscribe(watcher3);

		couch.executeWorkout(new StandUpWorkout(example));
		couch.executeWorkout(new LieDownWorkout(example));
		couch.executeWorkout(new StandUpWorkout(example));
    }
}
