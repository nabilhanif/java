public class ExContinueLabel {

    public static void main(String[] args){
        outerloop:
        for( int i=0; i<5; i++ ){
            for( int j=10; j<5; j++ ){
                //message1
                System.out.println("Inside for(j) loop");
                if( j == 2 ) continue outerloop;
            }
            //message2
            System.out.println("Inside for(i) loop");
        }
    }
}