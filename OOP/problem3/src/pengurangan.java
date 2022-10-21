public class pengurangan {
    private int nilaiX, nilaiY;
    public int hasil;

    public void setData(int x, int y){
        this.nilaiX = x;
        this.nilaiY = y;
    }
    public void setPengurangan(){
        this.hasil = this.nilaiX - this.nilaiY;
    }
    public int getPengurangan(){
        return this.hasil;
    }
}
