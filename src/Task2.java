public class Task2 {
    private float l;
    private float n;
    private float h ;

    public Task2(float l, float n, float h) {
        this.l = l;
        this.n = n;
        this.h = h;
    }

    void printOut1(){
        float acreage1 = (float)((l+n)/2*h);
        System.out.println("S hinh thang: " + acreage1);
    }
}
