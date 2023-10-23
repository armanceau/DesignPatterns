package Classes;
public class cours {
    private int id;
    private String nom;

    public cours(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }    
}

class FabriqueCours {
    public static cours creerCours(int id, String nom) {
        return new cours(id, nom);
    }
}

