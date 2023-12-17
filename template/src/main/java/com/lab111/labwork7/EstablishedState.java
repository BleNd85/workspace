package main.java.com.lab111.labwork7;

public class EstablishedState implements ConnectionState {
    private TCPConnection tcpConnection;

    public EstablishedState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {
        System.out.println("Already in LISTENING state");

    }

    @Override
    public void establish() {
        System.out.println("ESTABLISHED");

    }

    @Override
    public void close() {

    }
}
