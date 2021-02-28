public class AgentPermanent extends Agent{
    private static Double tarifSemaine = 1000;
    private String codeCNSS;
    public AgentPermanent(Integer ns, String no, String a, String d, String co, String cnss, Integer numSemaine){
        super(ns,  no, a, d, co, numSemaine * AgentPermanent.tarifSemaine);
        codeCNSS = cnss;
    }
    // getter and setters
    public String toString(){
        String result = super.toString();
        result += "code CNSS: "+ "cnss";
        return result;
    }
}