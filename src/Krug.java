public class Krug extends GeometrijskiLik {

    private double radijus;

    public Krug( String Naziv,double radijus) {
        super(Naziv);
        this.radijus = radijus;
    }

    @Override
    public double povrsina() {
        return Math.pow(radijus,2)*Math.PI;
    }

    @Override
    public double opseg() {
        return 2*radijus*Math.PI;
    }

    @Override
    public int compareTo(GeometrijskiLik o) {
        return Double.compare(this.povrsina(), o.povrsina());
    }
}
