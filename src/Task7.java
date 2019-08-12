public class Task7 {
    private float x;

    public Task7(float x) {
        this.x = x;
    }
    public void printOut7(){
        double results;
        results = Math.pow(x, 3) + Math.log( Math.pow(x, 4) + 2) + Math.pow( x-4, 1/3 );
        System.out.println("Task7 : " + results);
    }
}
