interface Math{
    int operation(int num1, int num2);
}


class AnnonymousClass {
    public static void main(String[] args) {
        int x = 100, y = 50;

        Math addition = new Math() {
            public int operation(int num1, int num2){
                return num1 + num2;
            }
        };
        
        Math substraction = new Math() {
            public int operation(int num1, int num2){
                return num1 - num2;
            }
        };
        
        Math division = new Math(){
            public int operation(int num1, int num2){
                return num1 / num2;
            }
        };
        
        Math multiplication = new Math() {
            public int operation(int num1, int num2){
                return num1 * num2;
            }
        };

        
        System.out.println(x + " + " + y + " = " + addition.operation(x, y));
        System.out.println(x + " - " + y + " = " + substraction.operation(x, y));
        System.out.println(x + " / " + y + " = " + division.operation(x, y));
        System.out.println(x + " * " + y + " = " + multiplication.operation(x, y));
    }
}
