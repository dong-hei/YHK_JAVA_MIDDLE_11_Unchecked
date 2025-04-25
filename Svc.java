package exception.basic.unchecked;


/**
 * UnChecked Ex는 예외를 잡거나 던지지 않아도 된다
 * 자동으로 밖으로 던진다
 */
public class Svc {
    Client c = new Client();

    //필요한 경우 예외를 잡아 처리할수 있다.
    public void callCatch(){
        try {
            c.call();
        } catch (MyUnCheckedEx e) {
            System.out.println("예외처리 message = " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    //예외를 잡지않아도 자연스레 상위로 넘어간다.
    public void callThrow(){
        c.call();
    }
}
