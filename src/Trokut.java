public class Trokut extends GeometrijskiLik {

    private int a, b, c;

    public Trokut(String Naziv, int a, int b, int c) {
        super(Naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double povrsina() {
        //Heronova formula za izracun povrsine
        double srednjica = (a + b + c) / 2.0;
        return Math.sqrt(srednjica * (srednjica - a) * (srednjica - b) * (srednjica - c));
    }

    @Override
    public double opseg() {
        return a + b + c;
    }

    @Override
    public int compareTo(GeometrijskiLik o) {
        return   Double.compare(this.povrsina(), o.povrsina());
    }
}
