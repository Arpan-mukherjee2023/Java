public class Series {
    public static void main(String[] args) {
        int terms = 4;
        double sum = 0.0;
        int k = 5;
        for(int i = 1; i <= terms; i++, k += 2){
            if(i % 2 == 0){
                sum = sum - (double)i/k;
            }
            else{
                sum = sum + (double)i/k;
            }
        }
        System.out.println("The sum of the series is : " + sum);
    }
}
