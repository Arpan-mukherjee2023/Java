public class Peterson {
    static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int num = 145;
        int sum = 0;
        int temp = num;
        while(num != 0){
            sum += factorial(num%10);
            num /= 10;
        }
        if(temp == sum)
            System.out.println("Peterson number");
        else
            System.out.println("Not Peterson number");
    }
}
