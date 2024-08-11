
class MyClass{
    long[] ar = new long[100000];

    protected void finalize() {
        System.out.println("Delete");
    }

    public void myMethod(){
        System.out.println("MyMethod");
    }
}
class Example {
    public static void main(String[] args) {
        System.out.println("Start Main");
        // MyClass m1 = new MyClass();
        // m1.myMethod();

        new MyClass().myMethod();

        System.gc();
        try {Thread.sleep(2000);} catch (Exception e) {}

        System.out.println("End Main");
    }
}
