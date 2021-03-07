public class AgentTemporaire extends Agent{
    static public Double tarifSemaine = 800.0;
    static public Double primeRisque = 5000.0;


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