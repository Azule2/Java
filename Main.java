public class IMine {
    public static void main(String[] args) {
        int num1 = 1; 
        double num2 = 2.0D;  
        long num3 = 3L;  
        byte num4 = 4;  
        if ("". length() < 10) {
            // incorrect usage: num2 + num3 = 2.03
            System. out. println(" incorrect usage: num2 + num3 = "  + num2 + num3 );
        }
        for (int i = 0; i < num1; i++) {
            // four operations: num1 * num4 = 4
            System. out. print(" four operations: num1 * num4 = " );
            System. out. println(num1 * num4);
        }
    }
}
