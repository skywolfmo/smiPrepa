public class Agent {
    private Integer numSom;
    private String nom;
    private String adresse;
    private String date_embauche;
    private String codeService;
    private Double salaire;

    public Agent(Integer ns, String no, String a, String d, String co, Double s) {
        numSom = ns;
        setNom(no);
        setAdresse(a);
        setDate_embauche(d);
        setCodeService(co);
        setSalaire(s);
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getDate_embauche() {
        return date_embauche;
    }

    public void setDate_embauche(String date_embauche) {
        this.date_embauche = date_embauche;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNumSom() {
        return numSom;
    }
    public void setNumSom(Integer num) {
        numSom = num;
    }
    // Getters And Setters

    public String toString(){
        String result = "Num Somme: " + numSom + "\n Nom: ...";
        return result;
    }


}