public class persegi {
    private int sisi;
    public int luaspersegi, kelilingpersegi;

    public void getData(int s){
        this.sisi = s;
    }
    public void setLuas (){
        this.luaspersegi = this.sisi*this.sisi;
    }
    public int getLuas(){
        return this.luaspersegi;
    }


    public void setKeliling(){
        this.kelilingpersegi = 4*this.sisi;
    }
    public int getKeliling(){
        return this.kelilingpersegi;
    }
}
