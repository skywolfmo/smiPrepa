public class Agent{
    private Integer numSom;
    private String nom;
    private String adresse;
    private String date_embauche;
    private String codeService;
    private Double salaire;

    public Agent(Integer ns, String no, String a, String d, String co, Double s){
        numSom = ns;
        nom = no;
        adresse = a;
        date_embauche = d;
        codeService = co;
        salaire = s;
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