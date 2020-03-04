import java.io.*;

public class TestChaines {
    public static void main(String[] args) throws IOException {
        int nombre = 12345;
        String str = new String();
        str = String.valueOf(nombre);
        System.out.println(str);

        BufferedReader entree = new BufferedReader(new InputStreamReader (System.in));
        str = entree.readLine();
        nombre = Integer.parseInt(str);
        System.out.println(nombre);
        nombre++;
        System.out.println(nombre);

        String str2 = new String();
        str2 = entree.readLine();
        float reel = Float.parseFloat(str2);
        System.out.println(reel);
        reel += 1.1;
        System.out.println(reel);

        String ville = new String();
        ville = entree.readLine();
        ville = ville.trim().toUpperCase();
        System.out.println(ville);

        String s1 = new String();
        String s2 = new String();
        s1 = entree.readLine();
        s2 = entree.readLine();
        if (s1.charAt(0) == s2.charAt(0)) {
            System.out.println("Meme premier caractere");
        }
        else {
            System.out.println("Premier caractere different");
        }

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        
    }
}