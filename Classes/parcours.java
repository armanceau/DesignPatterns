package Classes;

import java.util.Scanner;
import java.util.ArrayList;

public class parcours {
    // Déclaration d un nouveau parcours 
    static ArrayList<cours> ParcoursDev = new ArrayList<>();
    static ArrayList<cours> ParcoursCyber = new ArrayList<>();

    public static void AjouterCours() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insérez le nom de cours à ajouter : ");
        String nomCours = scan.nextLine();
        cours CoursAjout = cours.creerCours(ParcoursDev.size()+1, nomCours);
        ParcoursDev.add(CoursAjout);
        scan.close();
    }

}
