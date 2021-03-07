public class AgentPermanent extends Agent {
    static Double tarifSemaine = 1000.0;
    private String codeCNSS;

    public AgentPermanent(Integer ns, String no, String a, String d, String co, String cnss, Integer numSemaine) {
        super(ns, no, a, d, co, numSemaine * AgentPermanent.tarifSemaine);
        setCodeCNSS(cnss);
    }

    public String getCodeCNSS() {
        return codeCNSS;
    }

    public void setCodeCNSS(String codeCNSS) {
        this.codeCNSS = codeCNSS;
    }

    // getter and setters
    public String toString(){
        String result = super.toString();
        result += "code CNSS: "+ "cnss";
        return result;
    }
}