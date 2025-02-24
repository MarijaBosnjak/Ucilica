public class Pravokutnik extends GeometrijskiLik {

    private int a,b;


    public Pravokutnik(String Naziv, int a, int b) {
        super(Naziv);
        this.a = a;
        this.b = b;
    }

    @Override//metoda koju smo defnirali u superklasi
    public double povrsina() {
        return a*b;
    }

    @Override
    public double opseg() {
        return 2*(a+b);
    }

    @Override
    public int compareTo(GeometrijskiLik o) {
          return Double.compare(this.povrsina(), o.povrsina());
    }
}
