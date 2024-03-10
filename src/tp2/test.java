package tp2;

import java.util.*;
public class test {
    public static void main(String args[]) {
        Etudiant e1 = new Etudiant("123", "malak");
        Etudiant e2 = new Etudiant("124", "sarra");
        Note n = new Note("histoire", 17);
        e1.addnote(n);
        Note n2 = new Note("math", 16);
        e1.addnote(n2);
        e1.affiche();
        Note n3 = new Note("histoire", 14);
        e2.addnote(n3);
        Note n4 = new Note("math", 13);
        e2.addnote(n4);
        e2.affiche();
        List<Etudiant> l = new Vector<>();
        l.add(e1);
        l.add(e2);
        Stats s = new Stats();
        System.out.println("avant tri");
        s.afficherStatsEtudiants(l);

        
        double moyenneGroupe = Stats.getMoyenneGroupe(new Vector<>(l));
        double maxGroupe = Stats.getMaxGroupe(new Vector<>(l));
        double minGroupe = Stats.getMinGroupe(new Vector<>(l));

        System.out.println("Moyenne du groupe: " + moyenneGroupe);
        System.out.println("Maximum du groupe: " + maxGroupe);
        System.out.println("Minimum du groupe: " + minGroupe);

        Collections.sort(l);
        System.out.println("apres tri");
        s.afficherStatsEtudiants(l);
        MatComparator c = new MatComparator();
        System.out.println("tri mat");
        Collections.sort(l, c);
        s.afficherStatsEtudiants(l);
    }
}
