class Fibonacci{
    public static void main(String[] args) {
        int no_of_terms = 10;
        int first = 0,second = 1;
        int third;
        System.out.print("The Fibonacci series is : "+first+" "+second);
        for(int i = 0; i < no_of_terms; i++){
            third = first+second;
            System.out.print(" "+third);
            first = second;
            second = third;
        }
    }
}