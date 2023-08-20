public class XylemPhloem {
    static int count_digit(int n){
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        return count;
    }
    static int getsum(int n){
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 173156;
        String s = String.valueOf(num);
        String first = s.substring(0,1);
        String last = s.substring(count_digit(num)-1);
        String middle = s.substring(1, count_digit(num)-1);
        if(Integer.parseInt(last) + Integer.parseInt(first) == getsum(Integer.parseInt(middle))){
            System.out.println("Xylem Number");
        }
        else{
            System.out.println("Phloem Number");
        }
    }
}
