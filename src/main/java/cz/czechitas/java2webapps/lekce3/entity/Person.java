package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Person {
    //jméno, příjmení, datum narození a také věk vypočtený
    /*Vytvoř entitu cz.czechitas.java2webapps.lekce3.entity.Person, která bude obsahovat jméno, příjmení,
    datum narození a také věk vypočtený z data narození.
V kontroléru vytvoř instanci entity Person, zadej do ní nějaké údaje a vlož ji do modelu pod klíčem person.*/
    private String jmeno;
    private String prijmeni;
    private LocalDate datumNarozeni;

    public Person() {
    }

    public Person(String jmeno, String prijmeni, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }


    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public int getVek(){
        Period vek = datumNarozeni.until(LocalDate.now());
        return vek.getYears();
    }

}
