package main.java.com.lab111.labwork7;

public class ClosedState implements ConnectionState {
    private TCPConnection tcpConnection;

    public ClosedState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {
        System.out.println("Already LISTENING!");

    }

    @Override
    public void establish() {
        System.out.println("Already established!");

    }

    @Override
    public void close() {
        tcpConnection.setConnectionState(tcpConnection.getListeningState());
        System.out.println("CLOSED");
    }
}
