public class  Truk{

    double muatan, muatanmaks;

    public Truk(double beratmaks){
        muatanmaks = beratmaks;
    }

    public double getMuatan() {

        return muatan;
    }

    public double getMuatanMaks(){

        return muatanmaks;
    }

    public void tambahMuatan(double berat){

        if ((muatan+berat) <= muatanmaks){
            muatan +=berat;
        }

    
    }
}