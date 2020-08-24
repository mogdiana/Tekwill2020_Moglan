public class Test {
    public static void main(String[] args) {
/*        byte a = 3;
        int b = -10;
        //Incrementarea
        a++;
        System.out.println(a+b);
        long x = 13129028904820l;
        double y = x;
        float f = 123.6783535532525f;
        double d = 12.345904454;
        System.out.printf("%d\n", x);
        System.out.printf("%f\n",y);
        System.out.println(d);
        String l = 20 + 20 + " Hello " + 2021;
        System.out.println(l);
        int s = 10;
        switch (s){
            case 2:
                System.out.println("2");
            case 10:
                System.out.println("10");
                break;
            case 1:
                System.out.println("1");
            default: {
                System.out.println("Nici o varianta");
            }
        }
        if (false)
            System.out.println("This ");
        for (int i = 1; i <= 5; i++){
            int j = 20;
            System.out.println(j);
        }
        System.out.println(j);
    */
    Angajat angajat1 = new Angajat();
    angajat1.printeazaVirstaSiNume();
    long virsta = angajat1.getVirsta();
    System.out.println(virsta);
    long sum = virsta + 10;
    angajat1.setNume("Andrei");
    angajat1.setVirsta(30L);
    System.out.println(angajat1.getVirsta());
    angajat1.printeazaNume();

    Angajat angajat2 = new Angajat();
    System.out.println(angajat2.getVirsta());
    angajat2.setNume("Vasile");
    angajat2.printeazaNume();

    }

}

