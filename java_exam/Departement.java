import java.util.ArrayList;

public class Departement {
    private String nom;
    private ArrayList<Enseignant> enseignantList = new ArrayList<Enseignant>();
    private ArrayList<Etudiant> etudiantList = new ArrayList<Etudiant>();

    public Departement(String nom){
        this.nom = nom;
    }
    public Departement(String nom, ArrayList<Enseignant> enseignantList, ArrayList<Etudiant> etudiantList){
        this.nom = nom;
        this.enseignantList = enseignantList;
        this.etudiantList = etudiantList;
    }

    public void addEtudiant(Etudiant e){
        etudiantList.add(e);
    }
    public void addEnseignant(Enseignant e){
        enseignantList.add(e);
    }
    public ArrayList<Etudiant> getEtudiantList() {
        return etudiantList;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Enseignant> getEnseignantList() {
        return enseignantList;
    }

    public void setEnseignantList(ArrayList<Enseignant> enseignantList) {
        this.enseignantList = enseignantList;
    }

    public void setEtudiantList(ArrayList<Etudiant> etudiantList) {
        this.etudiantList = etudiantList;
    }

}