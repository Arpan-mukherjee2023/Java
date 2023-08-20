public class Prime{
    public static void main(String[] args) {
        int num = 9;
        int i = num-1;
        int flag = 1;
        while(i != 1){
            if(num % i  == 0){
                flag = 0;
            }
            i--;
        }
        if(flag == 0){
            System.out.println("This is not a prime number");
        }
        else{
            System.out.println("This is a prime Number");
        }
    }
}
