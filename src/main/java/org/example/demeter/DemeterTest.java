package org.example.demeter;

public class DemeterTest {

    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setStar(new Star("刘德华"));
        agent.setFans(new Fans("小青"));
        agent.setCompany(new Company("浪潮"));
        agent.meeting();
        agent.business();
    }

}
