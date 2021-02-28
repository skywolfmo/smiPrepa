public class test{
     public static void main(String[] args) {
        Agent a1 = new AgentPermanent(5145, "Ahmed", "Agadir bloc4", "15/02/2015", "sdasd4554", "34jlkjlwe", 8);
        Agent a2 = new AgentPermanent(5145, "Ahmed2", "Agadir bloc3", "15/11/2015", "sdasd4554", "34jlkjlwe", 8);
        Agent a3 = new AgentTemporaire(5145, "Ahmed3", "Agadir bloc2", "15/10/2015", "sdasd4554", "34jlkjlwe", 3);
        Agent a4 = new AgentTemporaire(5145, "Ahmed4", "Agadir bloc 11", "15/03/2015", "sdasd4554", "34jlkjlwe", 8);
        ArrayList<Agent> aList = new ArrayList<Agent>();
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.add(a4);
        Iterator<Agent> it = new Iterator<Agent>();
        Double res = 0;
        while(it.hasNext()){
            res += it.next().getSalaire();
        }
        System.out.println("Total mass salariale:" + res);
        
        
    }
}