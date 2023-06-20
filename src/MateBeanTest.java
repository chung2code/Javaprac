public class MateBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean();  //Heap 메모리에 올라간다
        math.printClassName();
        math.printnumber(5000);
        int x = math.getOne();
        System.out.println(x);
        math.plus(200,300);

    }
}
