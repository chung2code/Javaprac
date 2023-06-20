public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine.printVersion();
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();


        String product = vm1.pushProductButton(100);
        //Vm1.PrintVersion(); //static한 메소드는 레퍼런스변수면.static메소드()
        //메소드 안에 선언된 변수를 지역변수라고 한다->>>메소드가 호출될때 생성 /메소드가 종료될때 사라짐
        System.out.println(product);
        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);

    }
}
//자바는 classpath에서 찾아서 run한다