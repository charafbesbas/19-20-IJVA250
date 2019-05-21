package com.example.demo;

import com.example.demo.entity.Facture;
import org.junit.Test;

public class FactureTest {

    @Test
    public void getTotal_factureVideSansArticleRetourneZero () {

        Facture facture = new Facture();

        Double total = facture.getTotal();
    }
}
