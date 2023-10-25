package Classes;

import java.util.List;
import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        eleve eleve1 = eleve.creerEleve(1, "Manceau", "Arthur", "arthur.manceau@efrei.net");

        parcours InstanceDev = new parcours();
        List<cours> parcoursDev = InstanceDev.ParcoursDev;

        parcours InstanceCyber = new parcours();
        List<cours> ParcoursCyber = InstanceCyber.ParcoursCyber;


        // Déclaration des nouveaux cours
        cours coursJava = cours.creerCours(1, "Java");
        cours coursPHP = cours.creerCours(2, "PHP");
        cours coursDesignPatterns = cours.creerCours(3, "Design patterns");
         
        // Ajout des cours au parcours
        InstanceDev.ParcoursDev.add(coursJava);
        InstanceDev.ParcoursDev.add(coursPHP);
        InstanceDev.ParcoursDev.add(coursDesignPatterns);

        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("MyEfrei");
        System.out.println();
        
        boolean continuerNavigation = false;
        while(!continuerNavigation) {
            System.out.println();
            System.out.println("---------------------------------------------------");
            System.out.println();
            System.out.println("Voici la liste des possibilités que vous pouvez réaliser : ");
            System.out.println();
            System.out.println("1- Voir les parcours disponibles de l'EFREI");
            System.out.println("2- Ajouter un cours au parcours choisi");
            System.out.println("3- Voir la liste des cours du parcours choisi");
            System.out.println();
            System.out.println("Quelle option voulez-vous réaliser ? (1, 2, 3)");
            
            Integer option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 1 : 
                    System.out.println();
                    System.out.println("---------------------------------------------------");
                    System.out.println();
                    System.out.println("Voici la liste des parcours présents à l'EFREI : ");
                    System.out.println();
                    System.out.println("- Parcours 1 : Parcours de developpement.");
                    System.out.println("- Parcours 2 : Parcours de cyber securite.");
                break; 

                case 2: 
                    
                    boolean numAjoutParcoursValide = false;    
                    while(!numAjoutParcoursValide){
                        String nomCours = "";
                        System.out.println("A quel parcours voulez-vous ajouter un cours ? (1,2)");
                        Integer parcoursAjout = scan.nextInt();

                        if(parcoursAjout.equals(1)){
                            System.out.println("Insérez le nom du cours à ajouter : ");
                            nomCours = scan.nextLine();

                            while (nomCours.isEmpty()) {
                                System.out.println("Le nom du cours ne peut pas être vide. Réessayez : ");
                                nomCours = scan.nextLine();
                            }

                            cours CoursAjout = cours.creerCours(InstanceDev.ParcoursDev.size() + 1, nomCours);
                            InstanceDev.ParcoursDev.add(CoursAjout);

                            // Informer les observateurs que le parcours a été mis à jour
                            InstanceDev.notifyObservers("le parcours Dev");
                            numAjoutParcoursValide = true;
                        }
                        else if (parcoursAjout.equals(2)){
                            System.out.println("Insérez le nom du cours à ajouter : ");
                            nomCours = scan.nextLine();

                            while (nomCours.isEmpty()) {
                                System.out.println("Le nom du cours ne peut pas être vide. Réessayez : ");
                                nomCours = scan.nextLine();
                            }

                            cours CoursAjout = cours.creerCours(InstanceCyber.ParcoursCyber.size()+1, nomCours);
                            InstanceCyber.ParcoursCyber.add(CoursAjout);

                            InstanceCyber.notifyObservers("le parcours Cyber");
                            numAjoutParcoursValide = true;
                        }
                        else{

                            System.out.println("Désolé je n'ai pas compris");
                        }
                    }
                    

                break;

                case 3 : 
                    boolean numParcoursValide = false;
                    while(!numParcoursValide){
                        System.out.println();
                        System.out.println("---------------------------------------------------");
                        System.out.println();
                        System.out.println("De quel parcours souhaitez-vous voir les cours ? (1, 2)");
                        String numParcours = scan.nextLine();

                        if(numParcours.equals("1")){
                            System.out.println();
                            // Affichage des cours du parcours : parcoursDev
                            if(InstanceDev.ParcoursDev.isEmpty()){   
                                System.out.println("Il n'y a actuellement aucun cours dans ce parcours.");
                            }
                            else{
                                System.out.println("Voici la liste des cours présents dans le parcours de developpement : ");
                                for (cours cours : InstanceDev.ParcoursDev){
                                    System.out.println("-" + cours.getNom());
                                }
                            }
                            
                            numParcoursValide = true;
                        }
                        else if (numParcours.equals("2")){
                            // Affichage des cours du parcours : parcoursCyber
                            System.out.println();
                            if(InstanceCyber.ParcoursCyber.isEmpty()){   
                                System.out.println("Il n'y a actuellement aucun cours dans ce parcours.");
                            }
                            else{
                               System.out.println("Voici la liste des cours présents dans le parcours cyber securite : ");
                                for (cours cours : InstanceCyber.ParcoursCyber){
                                    System.out.println("-" + cours.getNom());
                                }  
                            }
                            
                            numParcoursValide = true;
                        }
                        else{
                            System.out.println("Désolé, je n'ai pas compris votre demande. Assurez-vous de bien écrire 1 ou 2.");
                        }
                    }
                break;
                default:
                    System.out.println("Choix incorrect");
                break;
            }
        }  
         scan.close(); 
    }
}