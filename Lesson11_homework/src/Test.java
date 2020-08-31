public class Test {
    public static void main(String[] args) {
        Class5 a5 = new Class5();
        a5.x = 10;
        Class5 a6 = new Class5();
        a6.x = 100;
        a5.method1(a6);
        a6.method1(a5);

        Class6 a7 = new Class6();
        Class6 a8 = a7.method1();
        a8 = a7.method2();
    }
}
