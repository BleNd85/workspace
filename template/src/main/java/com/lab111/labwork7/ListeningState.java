package main.java.com.lab111.labwork7;

public class ListeningState implements ConnectionState {
    private TCPConnection tcpConnection;

    public ListeningState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {
        System.out.println("LISTENING");
        tcpConnection.setConnectionState(tcpConnection.getEstablishedState());
    }

    @Override
    public void establish() {
        System.out.println("Open connection first!");
    }

    @Override
    public void close() {
        System.out.println("Already closed!");
    }

}
