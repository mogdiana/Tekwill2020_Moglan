public class Operations {
    long a;
    double b;
    int num;
    String s1, s2;
    char c;

    /*Punctul 1*/
    public void setNumb(int n) {
        num = n;
    }

    public int getNumb() {
        return num;
    }

    public void Str(String str1, String str2) {
        s1 = str1;
        s2 = str2;

    }

    public String getStr() {
        return s1;
    }

    public void setChar(char symb) {
        c = symb;
    }

    public int getChar_Numb() {
        return (int) c;
    }

    /*Punctul 2*/
    /* 2.1. O metoda care calculeaza si afiseaza suma tuturor numerelor de la 0< n (n sa fie dinamic: ca argument).  */
    void Sum_numb() {
        System.out.print("Suma numerelor de la " + 0 + " pina la " + num + " = ");
        int sum = 0;
        for (int i = 0; i < num; i++)
            sum += i;
        System.out.println(sum);
    }

    /* 2.2. O metoda care afiseaza toate cifrele pare pina la un nr n (n sa fie dinamic: ca argument). */
    void Numb_even() {
        System.out.println("Numere pare de la " + 0 + " pina la " + num);
        for (int i = 0; i <= num; i++)
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            }
        System.out.println();
    }

    /* 2.3. O metoda care afiseaza la ecran "Hello" de 10 ori */
    void Print_Hello() {
        int i = 0;
        while (i < num) {
            System.out.print("Hello ");
            i++;
        }
        System.out.println();
    }

    /* 2.4. O metoda care afiseaza toate cifrele impare pina la un nr n (n sa fie dinamic: ca argument). */
    void Numb_odd() {
        System.out.println("Numere impare de la " + 0 + " pina la " + num);
        for (int i = 0; i <= num; i++)
            if ((i % 2) == 1) {
                System.out.print(i + " ");
            }
        System.out.println();
    }

    /* 2.5. O metoda care afiseaza suma cifrelor impare ale nr n (n sa fie dinamic: ca argument). */
    void Sum_odd() {
        int x, k = num, sum = 0;
        while (k != 0) {
            x = k % 10;
            if (x % 2 != 0) {
                sum += x;
            }
            k = k / 10;
        }
        System.out.println("Suma numerelor impare nr " + num + " = " + sum);
    }
}
