public class PerfectSquare {
    public static void main(String[] args) {
        int num = 17;
        double sqrt = Math.sqrt(num);
        if(Math.round(sqrt) == sqrt){
            System.out.println("This is a perfect square");
        }
    }
}
