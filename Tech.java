public class Tech {
    static int get_digit(int n){
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 9801;
        int digit = get_digit(n);
        if(digit % 2 == 0){
            String first_num, sec_num;
            String fnum = String.valueOf(n);
            first_num = fnum.substring(0, digit / 2);
            sec_num = fnum.substring(digit / 2);
            int sum = Integer.parseInt(first_num) + Integer.parseInt(sec_num);
            if(Math.pow(sum,2) == n){
                System.out.println("Tech number");
            }
        }

    }
}
