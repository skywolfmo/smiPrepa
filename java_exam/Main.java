import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {  
        // 3- A
        Etudiant e1 = new Etudiant("ahmed","massr_110", "tata@gmail.com", "12/05/2020","Gestion");
        Etudiant e2 = new Etudiant("ahmed","massr_110", "tata@gmail.com", "12/05/2020","Info");
        Etudiant e3 = new Etudiant("ahmed","massr_110", "tata@gmail.com", "12/05/2020","Gestion");
        Etudiant e4 = new Etudiant("ahmed","massr_110", "tata@gmail.com", "12/05/2020","Info");

        // 3- B
        ArrayList<Etudiant> etListGestion = new ArrayList<Etudiant>();
        etListGestion.add(e1);
        etListGestion.add(e3);

        ArrayList<Etudiant> etListInfo = new ArrayList<Etudiant>();
        etListInfo.add(e2);
        etListInfo.add(e4);

        Departement depGest = new Departement("Gestion", etListGestion);
        Departement depInfo = new Departement("Info", etListInfo);

        // 3 - C
        ArrayList<Departement> departements = new ArrayList<Departement>();
        departements.add(depGest);
        departements.add(depInfo);
        Institut esta = new Institut("ESTA", departements);
        // 3 - D
        EnseignantVacataire enva1 = new EnseignantVacataire("Dafi", "dafi@afdel.afd", "PH", 38, 120);
        EnseignantVacataire enva2 = new EnseignantVacataire("Oufdi", "oufdi@afdel.afd", "PH", 38, 500);

        EnseignantPermanent enpa1 = new EnseignantPermanent("Afdel", "Afdel@afdel.afd", "PES", 38, 500);
        EnseignantPermanent enpa2 = new EnseignantPermanent("Kouti", "Kouti@kouti.kou", "PES", 38, 500);
        // 3 - E
        Cour c1 = new Cour("C++", enpa1, etListInfo);
        Cour c2 = new Cour("D++", enpa1, etListInfo);

        
        System.out.print(enva1.calculeSalaire());
        System.out.print(enpa1.calculeSalaire());

        // 
        ArrayList<Enseignant> enseignants = new ArrayList<Enseignant>();
        enseignants.add(enva1);
        enseignants.add(enva2);
        enseignants.add(enpa1);
        enseignants.add(enpa2);

        Iterator<Enseignant> it = enseignants.iterator();
        Double res = 0.0;
        while(it.hasNext()){
            // wellahou a3lam
            res += it.next().calculeSalaire();
        }
        System.out.print(res);

    }

}