//Zadatak2.
//Primjetite neke elmente u klasama koje se ponavljaju.
//Implementirajte baznu klasu GeometrijskiLik te refaktorirajte
//klase Pravokutnik, Trokut i Krug na nacin
// da odgovaraju specifikaciji zadatka
//Geometrijski lik ce biti zapravo bazna klasa koju nasljeduju sve ove druge
public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {
    private String Naziv;

    public GeometrijskiLik(String naziv) {
        Naziv = naziv;
    }

    //Ove metode su u ovoj baznoj kalsi zapravo samo da imamo njihov naziv
    // te da ih kasnije mozemo @Override u klasama trokut,kkrug,pravokutnik
    //Metode koje u sebi nemaju nekakvo tijeklo koje ih opisuju
    //nazivamo abstraktnim metodama
    public abstract double povrsina();

    public abstract double opseg();//{
    // return 0.0;// abstraknta metoda je metoda koja nema tijelo //dodali
    //smo kljucnu rijec abstract i maknuli tijelo metode
    //}

    @Override
    public String toString() { //metoda tostring je zapravo default metoda za sve objekte
        // koja ispisuje sve defaltne vrijednosti objekta
        //  return super.toString();
        //sto znaci umjesto zapisa koji imamo kada pokrenemo ovo:
        //  System.out.println(krug1);//dobijemo samo informacije o objektima
        //  System.out.println(trokut1);
        //System.out.println(pravokutnik1);
        //rezultat u konzoli je
        //  Krug@723279cf
        //Trokut@10f87f48
        //Pravokutnik@b4c966a
        return "Naziv" + "\t" + Naziv + " \nPovrsina " + povrsina() + " \nopseg " + opseg();

    }
}
//Nekakvo odlicenje abstraknte klase jest ako imamo neku abstraktnu klasu od nje
//ne mozemo napraviti novi objekt unutar main Klase
//GeometrijskiLik geo1=new GeometrijskiLik();//ovo ne moze