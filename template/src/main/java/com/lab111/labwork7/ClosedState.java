package main.java.com.lab111.labwork7;

/**
 * Class which implements ConnectionState interface and its methods to change connection states
 *
 * @author Vladyslav
 */

public class ClosedState implements ConnectionState {
    /**
     * Field of an instance of TCPConnection(Context) class
     */
    private TCPConnection tcpConnection;

    /**
     * Constructor of ListeningState class
     *
     * @param tcpConnection Instance of TCPConnection class
     */
    public ClosedState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    /**
     * Method that changes state to "LISTENING"
     */
    @Override
    public void open() {
        System.out.println("Already LISTENING!");

    }

    /**
     * Method that changes state to "ESTABLISHED"
     */
    @Override
    public void establish() {
        System.out.println("Already established!");

    }

    /**
     * Method that changes state to "CLOSED" and provides next state
     */
    @Override
    public void close() {
        tcpConnection.setConnectionState(tcpConnection.getListeningState());
        System.out.println("CLOSED");
    }
}
