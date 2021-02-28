public class EnseignantPermanent extends Enseignant {

    private static final Integer chargeAnnuel = 350;
    private Integer nbrHour;

    public EnseignantPermanent(String nom, String email, String grade, Integer tauxIgr, Integer nbrHour) {
        super(nom, email, grade, tauxIgr, 0.0);
        this.nbrHour = nbrHour;
        this.setSalaire(this.calculeSalaire());
    }

    public Integer getNbrHour() {
        return nbrHour;
    }

    public void setNbrHour(Integer nbrHour) {
        this.nbrHour = nbrHour;
    }

    @Override
    public Double calculeSalaire() {
        // TODO I don't remember how to calculate this.
        return (double) nbrHour * this.getTauxIgr();
    }

}