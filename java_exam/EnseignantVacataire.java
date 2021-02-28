public class EnseignantVacataire extends Enseignant {
    private Integer nbrHours;

    public EnseignantVacataire(String nom, String email, String grade, Integer tauxIgr,
             Integer nbrHours) {
        super(nom, email, grade, tauxIgr, 0.0);
        // TODO Auto-generated constructor stub
        this.nbrHours = nbrHours;
        // ma3arfinch salaire ki dayr dakchi lach kayna temma 0 ta kan7essbouh mn be3d 
        // bhad calcule salaire 3ad kan7etouh fi salaire b setSalaire
        setSalaire(calculeSalaire());

    }

    public Integer getNbrHours() {
        return nbrHours;
    }

    public void setNbrHours(Integer nbrHours) {
        this.nbrHours = nbrHours;
    }
    @Override
    public Double calculeSalaire(){
        // kayna fi tp ma39eltch ki kat7sseb
        return (double) nbrHours*getTauxIgr();
    }

}
    