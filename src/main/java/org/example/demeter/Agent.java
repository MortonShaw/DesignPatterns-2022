package org.example.demeter;

public class Agent {

    private Star star;
    private Fans fans;
    private Company company;

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void meeting() {
        System.out.println(fans.getName() + "与明星" + star.getName() + "见面了！");
    }

    public void business() {
        System.out.println(company.getName() + "与明星" + star.getName() + "洽谈业务！");
    }

}
