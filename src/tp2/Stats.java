package tp2;

import java.util.*;

public class Stats {
    public void afficherStatsEtudiants(List<Etudiant> l) {
        Iterator<Etudiant> it = l.iterator();
        while (it.hasNext()) {
            Etudiant e = it.next();
            System.out.println("Moyenne: " + e.getValue());
            System.out.println("Max: " + e.getMax());
            System.out.println("Min: " + e.getMin());
        }
    }

    static double getMoyenneGroupe(Vector<Etudiant> L) {
        double moy = 0.0;
        for (Etudiant e : L) {
            moy += e.getValue();
        }
        return moy / L.size();
    }

    static double getMaxGroupe(Vector<Etudiant> L) {
        double max = Double.MIN_VALUE;
        for (Etudiant e : L) {
            if (e.getMax() > max) {
                max = e.getMax();
            }
        }
        return max;
    }

    static double getMinGroupe(Vector<Etudiant> L) {
        double min = Double.MAX_VALUE;
        for (Etudiant e : L) {
            if (e.getMin() < min) {
                min = e.getMin();
            }
        }
        return min;
    }
}
