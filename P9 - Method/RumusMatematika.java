public class RumusMatematika {

    double a, t; // deklarasi variable
    double l_segitiga;

    public static void main(String args[]){         //method main
        RumusMatematika rm = new RumusMatematika(); //deklarasi object dengan nama rm
        rm.luasSegitiga();                          //pemaggilan method luasSegitiga
    }

    void luasSegitiga(){
        a = 7;
        t = 10;
        l_segitiga = 0.5 * 1 * t;
        System.out.println("Luas Segitiga = "+l_segitiga);
    }
    
}

/**
* pemanggilan method luasSegitiga harus dideklarasikan object class nya terlebih dahulu
* karena method luasSegitiga tergolong method bukan static
 */

