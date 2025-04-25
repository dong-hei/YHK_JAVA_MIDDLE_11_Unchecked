package exception.basic.unchecked;

public class UncheckedCatchMain {
    public static void main(String[] args) {
        Svc svc = new Svc();
        svc.callCatch();
        System.out.println("정상 종료");
    }
}
