package Classes;

import java.util.Scanner;
import java.util.ArrayList;

public class parcours {
    // Déclaration d un nouveau parcours 
    static ArrayList<cours> ParcoursDev = new ArrayList<>();
    static ArrayList<cours> ParcoursCyber = new ArrayList<>();

    public static void AjouterCours() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Insérez le nom du cours à ajouter : ");
        String nomCours = scan2.nextLine();
        cours CoursAjout = cours.creerCours(5, nomCours);
        ParcoursDev.add(CoursAjout);
        scan2.close();
    }

}
