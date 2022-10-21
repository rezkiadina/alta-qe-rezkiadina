public class pembagian {
    private double nilaiX, nilaiY;
    public double hasil;

    public void setData(int x, int y){
        this.nilaiX = x;
        this.nilaiY = y;
    }
    public void setPembagian(){
        this.hasil = this.nilaiX / this.nilaiY;
    }
    public double getPembagian(){
        return this.hasil;
    }
}
