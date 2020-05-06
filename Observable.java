package commandObserver;

public interface Observable {
    public void subscribe(TrainedWatcher observer);
    public void unsubscribe(TrainedWatcher observer);
    public void notifyObservers();
}
