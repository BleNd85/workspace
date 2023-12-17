package main.java.com.lab111.labwork7;

public class TCPConnection {
    private ConnectionState listeningState;
    private ConnectionState establishedState;
    private ConnectionState closedState;
    private ConnectionState currentState;

    public TCPConnection() {
        listeningState = new ListeningState(this);
        establishedState = new EstablishedState(this);
        closedState = new ClosedState(this);
        currentState = closedState;
    }

    public void closeConnection() {
        currentState.close();
    }

    public void openConnection() {
        currentState.open();
    }

    public void establishConnection() {
        currentState.establish();
    }

    public ConnectionState getListeningState() {
        return listeningState;
    }

    public ConnectionState getEstablishedState() {
        return establishedState;
    }

    public ConnectionState getClosedState() {
        return closedState;
    }

    public void setConnectionState(ConnectionState connectionState) {
        currentState = connectionState;
    }
}