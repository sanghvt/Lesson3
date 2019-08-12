public class Task3 {
    private float r;

    public Task3(float r) {
        this.r = r;
    }

    void printout2(){
        float acreage2 = (float) (Math.pow(r,2)*Math.PI);
        System.out.println("S hinh tron: " + acreage2);
    }

}
