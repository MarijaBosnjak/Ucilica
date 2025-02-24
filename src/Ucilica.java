import java.util.ArrayList;
import java.util.Collections;

// Implementacija klase Ucilica
public class Ucilica {
    private ArrayList<GeometrijskiLik> likovi;

    public ArrayList<GeometrijskiLik> getLikovi() {
        return likovi;
    }

    public Ucilica() {
       this.likovi = new ArrayList<>();

        // Dodavanje likova u kolekciju
        likovi.add(new Krug("Mali", 4));
        likovi.add(new Trokut("Plavi", 4, 7, 8));
        likovi.add(new Pravokutnik("Manji", 3, 5));
        likovi.add(new Krug("Veliki", 15));
        likovi.add(new Trokut("Žuti", 8, 49, 55));
        likovi.add(new Pravokutnik("Veći", 15, 19));
    }

    // Metoda za ispis likova
    public void ispisiLikove() {
        for (GeometrijskiLik lik : likovi) {
            System.out.println(lik);
        }
    }

    // Metoda za sortiranje likova prema površini
    public void sortirajPoPovrsini() {
        Collections.sort(likovi);
    }
}
