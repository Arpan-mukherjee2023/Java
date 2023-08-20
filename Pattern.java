public class Pattern {
    public static void main(String[] args) {
        int row = 4;
        for(int i = 0; i < row; i++){
            for(int k = 0; k < row-i-1; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < (i+1) * 2; j++){
                if(j % 2 == 0){
                    System.out.print("A");
                }
                else{
                    System.out.print("B");
                }
            }
            System.out.println();
        }
    }
}
