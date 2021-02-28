import java.util.ArrayList;

public class Etudiant extends Personne {
    static private Integer nbrEtudiant = 0;
    private String dateInscription;
    private String numCIN;
    private String departementName;
    private ArrayList<Cour> coursList = new ArrayList<Cour>();

    public Etudiant(String nom, String numCIN, String email, String dateInscription, String departementName) {
        super(nom, Etudiant.nbrEtudiant, email);
        Etudiant.nbrEtudiant += 1;
        this.dateInscription = dateInscription;
        this.numCIN = numCIN;
        this.departementName = departementName;
    }

    public ArrayList<Cour> getCoursList() {
        return coursList;
    }

    public void addCour(Cour cour) {
        coursList.add(cour);
    }

    public void setCoursList(ArrayList<Cour> coursList) {
        this.coursList = coursList;
    }

    public String getDepartementName() {
        return departementName;
    }

    public void setDepartementName(String departementName) {
        this.departementName = departementName;
    }

    public String getNumCIN() {
        return numCIN;
    }

    public void setNumCIN(String numCIN) {
        this.numCIN = numCIN;
    }

    public String getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(String dateInscription) {
        this.dateInscription = dateInscription;
    }

}