package Patterns.Observer;

public interface Observable <T>{
    void registerObserver(Observer<T> observer);
    void removeObserver(Observer<T> observer);
    void notifyObservers(T data);
}
