public class Numbers {
    public static void main (String[] args) {
        Operations op1 = new Operations();
        op1.setNumb(10);
        System.out.println(op1.getNumb());
        op1.Str("Diana","Moglan");
        System.out.println(op1.getStr());
        op1.setChar('8');
        System.out.println(op1.getChar_Numb());

        Operations op2 = new Operations();
        op2.setNumb(10);
        op2.Sum_numb();
        op2.Numb_even();
        op2.Print_Hello();
        op2.Numb_odd();
        op2.setNumb(256987);
        op2.Sum_odd();
    }
}
