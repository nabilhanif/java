public class DemoSwitch2{
    public static void main(String[] args){
        int grade = 80;
        switch(grade){
            case 100:
            System.out.println("Exellent!");
            break;
            case 90:
            System.out.println("Good job!");
            break;
            case 80:
            System.out.println("Study Harder!");
            break;
            case 60:
            System.out.println("Study Harder!!!");
            break;
            default:
            System.out.println("Sorry, you failed!");
        }
    }
}