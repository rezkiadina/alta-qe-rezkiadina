public class kubus {
    private int sisi;
    public int volume;

    public void setData (int s){
        this.sisi = s;
    }
    public void setVolume(){
        this.volume = this.sisi*this.sisi*this.sisi;
    }
    public int getVolume(){
        return this.volume;
    }
}
