public class Series2 {
    static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int terms = 4;
        double sum = 0.0;
        int j = 1, k = 3;
        double data;
        for(int i = 0; i < terms; i++){
            data = (double)j/factorial(k);
            if(i % 2 != 0)
                sum += data;
            else
                sum -= data;
            j += 3;
            k += 4;
        }
        System.out.println("The series sum is : " + sum);
    }
}
