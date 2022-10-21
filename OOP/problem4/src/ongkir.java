class ongkir extends Dimensi{
    int berat, dimensi, harga;

    public void setOngkos(int p, int t, int l, int b) {
        this.berat = b;
        super.setData(p, t, l);
        super.setDimensi();
        this.dimensi = super.getDimensi();
    }
    public void setHarga(){
        if(this.berat < 1 && this.dimensi < 50){
             this.harga = 5000;
        }else  this.harga=this.berat*5000;
    }
    public int getHarga(){
        return this.harga;
    }
}
