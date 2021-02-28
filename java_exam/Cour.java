import java.util.ArrayList;

public class Cour {
    private String nom;
    private static Integer volumeHoraire=45;
    private Enseignant responsable;
    private ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();

    public Cour(String nom , Enseignant responsable, ArrayList<Etudiant> etudiants) {
        this.setNom(nom);
        this.setResponsable(responsable);
        this.setEtudiants(etudiants);
    }

    public void addEtudiant(Etudiant e){
        etudiants.add(e);
    }
    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
