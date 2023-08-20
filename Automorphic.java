public class Automorphic {
    static int get_digit(int n){
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 76;
        int sqr  = num*num;
        int flag = 1;
        int no_of_digit = get_digit(num);
        for(int i = 0 ;i < no_of_digit; i++){
            if((sqr % 10) != (num % 10)){
                flag = 0;
            }
            sqr /= 10;
            num /= 10;
        }
        if(flag == 0){
            System.out.println("This is not a Automorphic number");
        }
        else{
            System.out.println("It is a Automorphic number");
        }
    }
}
