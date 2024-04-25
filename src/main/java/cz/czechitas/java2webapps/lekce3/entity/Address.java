package cz.czechitas.java2webapps.lekce3.entity;

public class Address {
    String uliceACisloDomu;
    String obec;
    int PSC;

    public Address(){

    }
    public Address(String uliceACisloDomu, String obec, int PSC) {
        this.uliceACisloDomu = uliceACisloDomu;
        this.obec = obec;
        this.PSC = PSC;
    }

    public String getUliceACisloDomu() {
        return uliceACisloDomu;
    }

    public void setUliceACisloDomu(String uliceACisloDomu) {
        this.uliceACisloDomu = uliceACisloDomu;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public int getPSC() {
        return PSC;
    }

    public void setPSC(int PSC) {
        this.PSC = PSC;
    }


/**/



}
