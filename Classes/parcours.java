package Classes;
import java.util.ArrayList;
import java.util.List;

public class parcours {
    private List<Observer> observers = new ArrayList<>();
    List<cours> ParcoursDev = new ArrayList<>();
    List<cours> ParcoursCyber = new ArrayList<>();

    // Ajouter un observateur
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Supprimer un observateur
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifier les observateurs
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Ajouter un cours au parcours "Dev"
    public void ajouterCoursDev(cours cours) {
        ParcoursDev.add(cours);
        notifyObservers("le parcours Parcours Dev a été mis à jour");
    }

    // Ajouter un cours au parcours "Cyber"
    public void ajouterCoursCyber(cours cours) {
        ParcoursCyber.add(cours);
        notifyObservers("le parcours Parcours Cyber a été mis à jour");
    }
}
