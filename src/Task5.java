public class Task5 {
    private int x = 1234;
    private int y = 4321;

    public Task5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printOut5(){
        float value = (float) (x+y) / (x-y);
        System.out.println("Task 5 = " +value);
    }
}
