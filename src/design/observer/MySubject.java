package design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/23 1:40
 */
public class MySubject implements Subject {
    List<Observer> observers = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void update(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
