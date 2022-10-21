public class Dimensi {
    public int panjang, lebar, tinggi, dimensi;

    public void setData(int p, int t, int l){
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }
    public void setDimensi(){

        this.dimensi = this.panjang * this.lebar *this.tinggi;
    }
    public int getDimensi(){

        return dimensi;
    }
}
