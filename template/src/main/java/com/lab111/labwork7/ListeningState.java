package main.java.com.lab111.labwork7;

/**
 * Class which implements ConnectionState interface and its methods to change connection states
 *
 * @author Vladyslav
 */

public class ListeningState implements ConnectionState {
    /**
     * Field of an instance of TCPConnection(Context) class
     */
    private TCPConnection tcpConnection;

    /**
     * Constructor of ListeningState class
     *
     * @param tcpConnection Instance of TCPConnection class
     */
    public ListeningState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    /**
     * Method that changes state to "LISTENING" and provides next state
     */
    @Override
    public void open() {
        System.out.println("LISTENING");
        tcpConnection.setConnectionState(tcpConnection.getEstablishedState());
    }

    /**
     * Method that changes state to "ESTABLISHED"
     */
    @Override
    public void establish() {
        System.out.println("Open connection first!");
    }

    /**
     * Method that changes state to "CLOSED"
     */
    @Override
    public void close() {
        System.out.println("Already closed!");
    }
}
