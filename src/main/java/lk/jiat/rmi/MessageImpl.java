package lk.jiat.rmi;

import java.rmi.Remote;

public class MessageImpl implements Message, Remote {
    @Override
    public void hello() {
        System.out.println("Server: hello...");
    }
}
