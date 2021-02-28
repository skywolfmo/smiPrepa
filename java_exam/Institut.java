import java.util.ArrayList;

public class Institut {
    private String nom;
    private ArrayList<Departement> departementList = new ArrayList<Departement>();

    public void addDepartment(Departement d){
        this.departementList.add(d);
    }
    
    public String getNom() {
        return nom;
    }

    public ArrayList<Departement> getDepartementList() {
        return departementList;
    }

    public void setDepartementList(ArrayList<Departement> departementList) {
        this.departementList = departementList;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Institut(String nom, ArrayList<Departement> departementList) {
        this.nom = nom;
        this.departementList = departementList;
    }

    public Institut(String nom) {
        this.nom = nom;
    }
    
}