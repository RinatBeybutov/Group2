package observer;

public class Subject {

    private Observer[] observers;

    public Subject(int size) {
        observers = new Observer[size];
    }

    public void attach(Observer o) {
        for (int i = 0; i < observers.length; i++) {
            if(observers[i] == null) {
                observers[i] = o;
                break;
            }
        }
    }

    public void detach(Observer o) {
        for (int i = 0; i < observers.length; i++) {
            if(observers[i] != null && observers[i].getName().equals(o.getName())) {
                observers[i] = null;
            }
        }
    }

    public void notifyObjects(String message) {
        for (int i = 0; i < observers.length; i++) {
            if(observers[i] != null) {
                observers[i].update(message);
            }
        }
    }
}
