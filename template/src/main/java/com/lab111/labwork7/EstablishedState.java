package main.java.com.lab111.labwork7;

/**
 * Class which implements ConnectionState interface and its methods to change connection states
 *
 * @author Vladyslav
 */

public class EstablishedState implements ConnectionState {
    /**
     * Field of an instance of TCPConnection(Context) class
     */
    private TCPConnection tcpConnection;

    /**
     * Constructor of EstablishedState class
     *
     * @param tcpConnection Instance of TCPConnection class
     */

    public EstablishedState(TCPConnection tcpConnection) {
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
     * Method that changes state to "ESTABLISHED" and provides next state
     */
    @Override
    public void establish() {
        System.out.println("ESTABLISHED");
        tcpConnection.setConnectionState(tcpConnection.getClosedState());

    }

    /**
     * Method that changes state to "CLOSED" and provides next state
     */
    @Override
    public void close() {
        System.out.println("CLOSED");
        tcpConnection.setConnectionState(tcpConnection.getListeningState());
    }
}
