package designmode;

import designmode.factory.Factory;
import designmode.factory.Q7;

public class main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Q7 q7 = factory.factory(Q7.class);
        q7.drive();
    }
}
