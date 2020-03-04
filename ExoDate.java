/**
 * Date
 */

import java.text.SimpleDateFormat;
import java.util.*;

public class ExoDate {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(System.currentTimeMillis());
        System.out.println(d);
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE) + " " + c.get(Calendar.MONTH) + " " + c.get(Calendar.YEAR));
        String[] mois = { "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre" };
        String[] jSem = { "lundi", "mardi", "mecredi", "jeudi", "vendredi", "samedi", "dimanche" };
        System.out.println(jSem[c.get(Calendar.DAY_OF_WEEK)] + " " + c.get(Calendar.DATE) + " " + mois[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR));
        SimpleDateFormat f1 = new SimpleDateFormat("dd MMMMM yyyy HH:mm");
        System.out.println("Date : " + f1.format(d));
        SimpleDateFormat f2 = new SimpleDateFormat("dd MM yy HH:mm:ss");
        System.out.println("Date : " + f2.format(d));
        SimpleDateFormat f3 = new SimpleDateFormat("EEEE dd MMMMM yyyy HH:mm:ss");
        System.out.println("Date : " + f3.format(d));
    }
}