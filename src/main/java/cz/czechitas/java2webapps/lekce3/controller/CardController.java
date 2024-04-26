package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
@Controller
public class CardController {
    @GetMapping ("/")
    public ModelAndView getCard() {
        ModelAndView result = new ModelAndView("card");

        //definovani osoby
        Person prvniPerson = new Person("Heath", "Ledger", LocalDate.of(1990, 1, 1));

        result.addObject("person", prvniPerson);

        //definovani adresy
        //result.addObject("address", new Address ("Hell 547/6", "Heaven", "12300" ));

        return result; //jeden objekt jako je result muze reprezentovat jak adresu tak i osobu?
        //Lze v ramci jedne metody definoat vice objektu. Napr., zde bylo definovany metodu k
        //zobrazeni v ramci jedne karty jak jmeno, tak i adresu osoby.

    }


    public ModelAndView getAddress() {
        ModelAndView result1 = new ModelAndView("getAddress");
        Address adresa = new Address("Hell 547/6", "Heaven", "12300");

        result1.addObject("address", adresa);
        return result1;
    }
}
