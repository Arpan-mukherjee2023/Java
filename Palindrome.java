public class Palindrome {
    public static void main(String[] args) {
        int num = 1231;
        int temp = num;
        int sum = 0;
        while(num != 0){
            sum = sum*10 + (num%10);
            num = num / 10;
        }
        if(sum == temp){
            System.out.println("Yes it is a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
