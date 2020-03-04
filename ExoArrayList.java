import java.util.ArrayList;
import java.util.Scanner;

/**
 * ExoArrayList
 */
public class ExoArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entree = "Z";
        ArrayList<Float> notes = new ArrayList<Float>();

        while (entree.charAt(0) != 'Q') {
            System.out.println("Bienvenue.");
            System.out.println("Saisir une note : S");
            System.out.println("Afficher les notes : A");
            System.out.println("Modifier note : E");
            System.out.println("Calculer moyenne : M");
            System.out.println("Quitter : Q");
            System.out.print("> ");

            entree = sc.next();

            switch (entree.charAt(0)) {
                case 'S':
                    System.out.print("Saisir la note : ");
                    Float f = new Float(sc.next());
                    notes.add(f);
                    break;

                case 'A':
                    for (int i = 0; i < notes.size(); i++) {
                        System.out.println(notes.get(i));
                    }
                    break;

                case 'M':
                    if (notes.isEmpty()) {
                        System.out.println("Il n'y a aucune note !");
                    }
                    else {
                        Float moyenne = new Float(0.0);
                        for (int i = 0; i < notes.size(); i++) {
                            moyenne += notes.get(i);
                        }
                        System.out.println("Moyenne : " + moyenne.floatValue()/notes.size());
                    }
                    break;

                case 'E':
                    System.out.println("Saisir le rang de la note :");
                    int i = sc.nextInt();
                    System.out.println("Saisir la nouvelle note :");
                    Float note = new Float(sc.next());
                    notes.set(i, note);
                    break;

                case 'Q':
                    System.out.println("Au revoir.");
                    break;
                
                default:
                    break;
            }
        }
        sc.close();
    }
}