public class Series1 {
    static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int terms = 4,j = 3, k = 5;
        double sum = 0.0;
        for(int i = 0; i < terms; i++){
            sum += (double)j/factorial(k);
            j += 3;
            k += 4;
        }        
        System.out.println("The sum is : " + sum);
    }
}
