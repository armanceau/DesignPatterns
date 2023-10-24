package Classes;

import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {

        eleve eleve1 = eleve.creerEleve(1, "Manceau", "Arthur", "arthur.manceau@efrei.net");

        // Déclaration des nouveaux cours
        cours coursJava = cours.creerCours(1, "Java");
        cours coursPHP = cours.creerCours(2, "PHP");
        cours coursDesignPatterns = cours.creerCours(3, "Design patterns");
        cours coursJS = cours.creerCours(3, "JS");
        
        
        // Ajout des cours au parcours
        parcours.ParcoursDev.add(coursJava);
        parcours.ParcoursDev.add(coursPHP);
        parcours.ParcoursDev.add(coursDesignPatterns);
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Voici la liste des possibilités que vous pouvez réaliser : ");
        System.out.println("1- Voir les parcours disponibles de l'EFREI");
        System.out.println("2- Ajouter un cours au parcours choisi");
        System.out.println("3- Voir la liste des cours du parcours choisi");
        System.out.println("Quelle option voulez-vous réaliser ? (1, 2, 3)");
        int option = scan1.nextInt();

        switch (option){
            case 1 : 
                System.out.println("Voici la liste des parcours présents à l'EFREI : ");
                System.out.println("Parcours 1 : Parcours de developpement.");
                System.out.println("Parcours 2 : Parcours de cyber securite.");
            break; 

            case 2: 
                parcours.AjouterCours();
            break;

            case 3 : 
                Scanner scan = new Scanner(System.in);

                boolean numParcoursValide = false;
                while(!numParcoursValide){
                    System.out.println("De quel parcours souhiatez-vous voir les cours ? (1, 2)");
                    String numParcours = scan.nextLine();

                    if(numParcours.equals("1")){
                        System.out.println("Voici la liste des cours présents dans le parcours developpement : ");
                        // Affichage des cours du parcours : parcoursDev
                        for (cours cours : parcours.ParcoursDev){
                            System.out.println("-" + cours.getNom());
                        }
                        numParcoursValide = true;
                    }
                    else if (numParcours.equals("2")){
                        // Affichage des cours du parcours : parcoursCyber
                        System.out.println("Voici la liste des cours présents dans le parcours cyber securite : ");
                        for (cours cours : parcours.ParcoursCyber){
                            System.out.println("-" + cours.getNom());
                        } 
                        numParcoursValide = true;
                    }
                    else{
                        System.out.println("Désolé, je n'ai pas compris votre demande. Assurez-vous de bien écrire 1 ou 2.");
                    }
                }
                scan.close(); 
            break;
        }
        scan1.close();
         
    }
}