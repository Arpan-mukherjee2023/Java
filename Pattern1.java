public class Pattern1 {
    public static void main(String[] args) {
        int row = 4;
        int count = 1;
        int dt = 3;
        for(int i = 0; i < row; i++){
            for(int j = 1; j <= count;j++){
                System.out.print("*");
            }
            count += dt;
            dt++;
            System.out.println();
        }
    }
}
