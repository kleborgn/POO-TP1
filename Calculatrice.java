import java.util.*;

public class Calculatrice {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String entree = "A";
        double angle;

        while (entree.charAt(0) != 'F') {

            System.out.println("Calculette");
            System.out.println("Cosinus : tapez C");
            System.out.println("Sinus : tapez S");
            System.out.println("Tangente : tapez T");
            System.out.println("Fin :\ntapez F");

            entree = sc.next();

            switch (entree.charAt(0)) {
                case 'C':
                    entree = sc.next();
                    angle = Double.parseDouble(entree);
                    System.out.println("Resultat : " + Math.cos(angle));
                    break;
            
                case 'S':
                    entree = sc.next();
                    angle = Double.parseDouble(entree);
                    System.out.println("Resultat : " + Math.sin(angle));
                    break;

                case 'T':
                    entree = sc.next();
                    angle = Double.parseDouble(entree);
                    System.out.println("Resultat : " + Math.tan(angle));
                    break;

                case 'F':
                    System.out.println("Au revoir");
                    break;
                default:
                    break;
            }

        }
        sc.close();
    }
}