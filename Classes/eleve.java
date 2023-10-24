package Classes;

public class eleve extends personne{
    private String mailEleve;

    public eleve(Integer id, String nom, String prenom, String mailEleve) {
        super(id, nom, prenom);
        this.mailEleve = mailEleve;

    }

    public String getMailEleve() {
        return mailEleve;
    } 
    
    public void setMailEleve(String nom) {
        this.mailEleve = mailEleve;
    }



}