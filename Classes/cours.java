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

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    } 
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public static cours creerCours(int id, String nom) {
        return new cours(id, nom);
    }
}




