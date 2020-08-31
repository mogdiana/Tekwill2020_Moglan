public class Class1 {
    int x, y;
    protected void m1 () {
        System.out.println("Class1 Metoda1");
    }
    protected void m2 () {
        System.out.println("Class2 Metoda2");
    }
    public void m3 () {
        this.m1();
        this.m2();
    }
}
