public class problem6 {
    private static void DrawXYZ(int n){
     int cek = 1;
     for (int i = 0; i < n; i++){
         for (int j = 0; j < n; j++){
             String draw = "Y";
             if (cek%2 == 0){
                 draw = "Z";
             }
             if (cek%3 == 0) {
                 draw = "X";
             }
             System.out.print(draw + " ");
             cek++;
         }
         System.out.println("");
     }
    }
    public static void main(String[] args){
        DrawXYZ(3);
        System.out.println(" ");
        DrawXYZ(5);
        System.out.println(" ");
        DrawXYZ(1);
    }
}
