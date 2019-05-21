package com.example.demo;

import com.example.demo.entity.Facture;
import org.junit.Test;

public class FactureTest {

    @Test
    public void getTotal_factureVideSansArticleRetourneZero () {

        //GIVEN
        Facture facture = new Facture();

        //WHEN
        Double total = facture.getTotal();

        //THEN
    }
}
