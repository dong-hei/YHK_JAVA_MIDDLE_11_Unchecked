package exception.basic.unchecked;

public class UnCheckedThrowMain {
    public static void main(String[] args) {
        Svc svc = new Svc();
        svc.callThrow();
        System.out.println("정상 종료");
    }
}
