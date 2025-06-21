public class IfConditionStatement {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        //if(condition- true){ }
        if(b > a){
            System.out.println("If condition");
        } else if (b > a) {
            System.out.println("Else if condition");
        } else if (b > a) {
            System.out.println("Else if condition");
        }
        else if (b > a) {
            System.out.println("Else if condition");
        }
        else if (b > a) {
            System.out.println("Else if condition");
        }
        else if (b == a) {
            System.out.println("B == a condition");
        }else if (b != a) {
            System.out.println("B == a condition");
        }
        else{
            System.out.println("Else condition ");
        }

        System.out.println("Done ");
    }
}
