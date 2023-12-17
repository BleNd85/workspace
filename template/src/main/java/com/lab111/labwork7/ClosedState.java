package main.java.com.lab111.labwork7;

public class ClosedState implements ConnectionState {
    private TCPConnection tcpConnection;

    public ClosedState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {

    }

    @Override
    public void establish() {

    }

    @Override
    public void close() {

    }
}
