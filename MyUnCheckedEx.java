package exception.basic.unchecked;

/**
 * 런타임Ex를 상속받은 예외는 언체크 예외
 */
public class MyUnCheckedEx extends RuntimeException {
    public MyUnCheckedEx(String message) {
        super(message);
    }
}
