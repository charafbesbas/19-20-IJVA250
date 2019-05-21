package com.example.demo;

import com.example.demo.entity.Facture;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashSet;

public class FactureTest {

    @Test
    public void getTotal_factureVideSansArticleRetourneZero () {

        //GIVEN
        Facture facture = new Facture();
        facture.setLigneFactures((new HashSet<>()));

        //WHEN
        Double total = facture.getTotal();

        //THEN
        Assertions.assertThat(total).isEqualTo(0);
    }

    @Test
    public void getTotal_factureAvecUnArticleRetournePrixUnitaireDeLArticle () {

        //GIVEN
        Facture facture = new Facture();
        facture.setLigneFactures();

        //WHEN
        Double total = facture.getTotal();

        //THEN
        Assertions.assertThat(total).isEqualTo(0);
    }
}
