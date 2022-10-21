public class penjumlahan {
   private int nilaiA, nilaiB;
   public int hasil;

    public void setData(int a, int b){
        this.nilaiA = a;
        this.nilaiB = b;
    }
    public void setPenjumlahan(){
        this.hasil = this.nilaiA + this.nilaiB;
    }
    public int getPenjumlahan(){
        return this.hasil;
    }
}
