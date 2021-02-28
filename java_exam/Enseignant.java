import java.util.ArrayList;

public class Enseignant extends Personne {

    private static Integer nbrEns = 0;
    private String grade;
    private Integer tauxIgr;
    private Double salaire;
    private ArrayList<Cour> coursList = new ArrayList<Cour>();

    public Enseignant(String nom, String email, String grade, Integer tauxIgr, Double salaire) {
        super(nom, Enseignant.nbrEns, email);
        Enseignant.nbrEns += 1;
        this.grade = grade;
        this.tauxIgr = tauxIgr;
        this.salaire = salaire;
    }

    public void addCour(Cour cour){
        coursList.add(cour);
    }
    public ArrayList<Cour> getCoursList() {
        return coursList;
    }

    public void setCoursList(ArrayList<Cour> coursList) {
        this.coursList = coursList;
    }

    public String getGrade() {
        return grade;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    public Integer getTauxIgr() {
        return tauxIgr;
    }

    public void setTauxIgr(Integer tauxIgr) {
        this.tauxIgr = tauxIgr;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public Double calculeSalaire(){
        return salaire;
    }
    public Double calculeTauxIgr(){
        // voir le tp
        // TODO: 
        return (double) (tauxIgr / tauxIgr);
    }

}