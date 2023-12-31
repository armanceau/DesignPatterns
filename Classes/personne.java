package Classes;
public class personne {
    private int id;
    private String nom;
    private String prenom;

    public personne(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
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

    public String getPrenom() {
        return prenom;
    } 
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public static personne creerPersonne(int id, String nom, String prenom) {
        return new personne(id, nom, prenom);
    }
}
