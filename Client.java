package exception.basic.unchecked;

import exception.basic.checked.MyCheckedEx;

public class Client {
    public void call() {
        throw new MyUnCheckedEx("ex");
    }
}
