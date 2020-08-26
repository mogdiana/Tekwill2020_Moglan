package md.tekwill.exer;

public class classB {
    void metB () {
        System.out.println("Metoda B");
        classA ob1 = new classA();
        ob1.metA();
    }
    void metC (classA argA) {
        argA.metA();
    }
}
