import java.lang.Math;
public class Armstrong {
    static int get_digit(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int digit = get_digit(num);
        int sum = 0, last;
        while(num != 0){
            last = num % 10;
            sum += Math.pow(last,digit);
            num /= 10;
        }
        if(sum == temp){
            System.out.println("This number is a Armstrong number");
        }
        else{
            System.out.println("This is not a Armstrong number");
        }
        
    }
}
