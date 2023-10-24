package Classes;

public class professeur extends personne{
    private String mailProfesseur;

    public professeur(Integer id, String nom, String prenom, String mailProfesseur) {
        super(id, nom, prenom);
        this.mailProfesseur = mailProfesseur;

    }

    public String getMailEleve() {
        return mailProfesseur;
    } 
    
    public void setMailEleve(String mailProfesseur) {
        this.mailProfesseur = mailProfesseur;
    }

    public static professeur creerProfesseur(int id, String nom, String prenom, String mailProfesseur) {
        return new professeur(id, nom, prenom, mailProfesseur);
    }

}