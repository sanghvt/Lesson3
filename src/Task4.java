public class Task4 {
    private double a ;
    private double b ;
    private double c;

    public Task4(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void TamGiac() {
        double p = (a + b + c) / 2;
        double h = p * (p - a) * (p - b) * (p - c);
        double acreage3 = Math.sqrt(h);
        System.out.println("S Tam Giac: " + acreage3);
    }
}
