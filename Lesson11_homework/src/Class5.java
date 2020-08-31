public class Class5 {
    public int x, y;
    Class5 () {
        System.out.println("Class5");
    }
    public void method1 (Class5 a) {
        System.out.println("x current object = "+this.x);
        System.out.println("x from parameter = "+a.x);
    }
}
