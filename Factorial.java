public class Factorial {
    static int factorial(int num){
        if(num == 0 || num == 1)
            return 1;
        else
            return num*factorial(num-1);
    }
    public static void main(String[] args) {
        int num = 23;
        int fact = factorial(num);
        System.out.println("The factorial of "+num+" is "+fact);
    }
}
