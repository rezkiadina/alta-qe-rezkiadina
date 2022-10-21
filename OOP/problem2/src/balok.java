public class balok {
    private int panjang, lebar;
    public int tinggi, volume;

    public void setData(int p, int l, int t){
        this.panjang = p;
        this.lebar= l;
        this.tinggi= t;
    }
    public void setVolume(){
        this.volume = this.panjang * this.lebar * this.tinggi;
    }
    public int getVolume(){
        return this.volume;
    }
}
