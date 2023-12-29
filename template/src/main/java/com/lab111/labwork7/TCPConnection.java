package main.java.com.lab111.labwork7;

/**
 * Class which interacts with the state object and calls methods related to state changes
 *
 * @author Vladyslav
 */


public class TCPConnection {
    /**
     * Field that represents "LISTENING" state
     */
    private ConnectionState listeningState;
    /**
     * Field that represents "ESTABLISHED" state
     */
    private ConnectionState establishedState;
    /**
     * Field that represents "CLOSED" state
     */
    private ConnectionState closedState;
    /**
     * Field which represents current state
     */
    private ConnectionState currentState;

    /**
     * Constructor of TCPConnection class
     */
    public TCPConnection() {
        listeningState = new ListeningState(this);
        establishedState = new EstablishedState(this);
        closedState = new ClosedState(this);
        currentState = listeningState;
    }

    /**
     * Method that is used to switch state to "CLOSED"
     */
    public void closeConnection() {
        currentState.close();
    }

    /**
     * Method that is used to switch state to "LISTENING"
     */
    public void openConnection() {
        currentState.open();
    }

    /**
     * Method that is used to switch state to "ESTABLISHED"
     */
    public void establishConnection() {
        currentState.establish();
    }

    /**
     * Method that is used to get "LISTENING" state
     *
     * @return "LISTENING" state
     */
    public ConnectionState getListeningState() {
        return listeningState;
    }

    /**
     * Method that is used to get "ESTABLISHED" state
     *
     * @return "ESTABLISHED" state
     */
    public ConnectionState getEstablishedState() {
        return establishedState;
    }

    /**
     * Method that is used to get "CLOSED" state
     *
     * @return "CLOSED" state
     */
    public ConnectionState getClosedState() {
        return closedState;
    }

    /**
     * Method that is used to set current state
     *
     * @param connectionState Instance of ConnectionState interface
     */
    public void setConnectionState(ConnectionState connectionState) {
        currentState = connectionState;
    }
}