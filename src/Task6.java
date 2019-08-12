public class Task6 {
    private int x;

    public Task6(int x) {
        this.x = x;
    }

    void printOut6(){
        float result = (float) Math.sqrt( x + Math.sqrt( x + Math.sqrt(x) ) );
        System.out.println("Task 6 = " + result);
    }
}
