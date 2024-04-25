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
        Person prvniPerson = new Person("Al", "Pacino", LocalDate.of(1990, 1, 1));
        //result.addObject(prvniPerson); jedna moznost
        result.addObject("person", prvniPerson);
        return result;
    }

    public ModelAndView getAddress(){
        ModelAndView result1 = new ModelAndView("address");
        Address adresa = new Address("Hell 547/6", "Heaven", 12300 );
        result1.addObject("address", adresa);
        return  result1;
    }



}
