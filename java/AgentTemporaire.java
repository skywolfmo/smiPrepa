public class AgentTemporaire{
    static private Double tarifSemaine = 800;
    static private Double primeRisque = 5000;


    public AgentTemporaire(Integer ns, String no, String a, String d, String co, String cnss, Integer numSemaine){
        super(ns,  no, a, d, co, numSemaine * AgentPermanent.tarifSemaine);
    }
    // getters and setters
    
    public String toString(){
        String result = super.toString();
        result += "Tarif Semain: "+ AgentTemporaire.tarifSemaine;
        
        return result;
    }
}