public class Operations {
    long a;
    double b;
    int num;
    String s1, s2;
    char c;

    public void setNumb(int n) {
        num = n;
    }
    public int getNumb() {
        return num;
    }

    public void Str (String str1, String str2) {
        s1 = str1;
        s2 = str2;

    }

    String getStr () {
        return s1;
    }

    public void setChar(char symb) {
        c = symb;
    }

    public int getChar_Numb() {
        return (int)c;
    }
}
