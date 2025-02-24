import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//Omogućite sortiranje geometrijskih likova prema specifikaciji (po površini uzlazno).
//Implementirajte novu klasu Ucilica, koja će sadržavati kolekciju generiranih geometrijskih likova.
//Demonstrirajte sve funkcionalnosti.

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ucilica ucilica = new Ucilica();

        System.out.println("Prije sortiranja:");
        ucilica.ispisiLikove();

        // Sortiramo likove prema površini
        ucilica.sortirajPoPovrsini();

        System.out.println("Nakon sortiranja:");
        ucilica.ispisiLikove();

        }

    }
