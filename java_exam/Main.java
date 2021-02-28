public class Main{
    public static void main(String[] args) {  
        Etudiant e1 = new Etudiant("ahmed",....);
        Etudiant e2 = new Etudiant("ahmed",....);
        Etudiant e3 = new Etudiant("ahmed",....);
        Etudiant e4 = new Etudiant("ahmed",....);
        ArrayList<Etudiant> etListGestion = new ArrayList<Etudiant>();
        etListGestion.add(e1);
        etListGestion.add(e3);

        Departement depGest = new Departement("Gestion", etListGestion);
        Departement depInfo = new Departement("Info", etListGestion);
        Departement depGeo = new Departement("Geo", etListGestion);
    }

}