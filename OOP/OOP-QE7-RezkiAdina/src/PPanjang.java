public class PPanjang {
    private int panjang, lebar;
    public int luas, keliling;

    public void setData(int p, int l){
        this.panjang = p;
        this.lebar = l;
    }
    public void setLuas(){
        this.luas = this.panjang*this.lebar;
    }
    public int getLuas(){
        return this.luas;
    }
    public void setKeliling(){
        this.keliling = (2*this.panjang) + (2*this.lebar);
    }
    public int getKeliling(){
        return this.keliling;
    }
}
