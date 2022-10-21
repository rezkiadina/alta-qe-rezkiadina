public class perkalian {
    private int nilaiA, nilaiB;
    public int hasil;

    public void setData(int a, int b){
        this.nilaiA = a;
        this.nilaiB = b;
    }
    public void setPerkalian(){
        this.hasil = this.nilaiA*this.nilaiB;
    }
    public int getPerkalian(){
        return this.hasil;
    }
}
