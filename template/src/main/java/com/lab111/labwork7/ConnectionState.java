package main.java.com.lab111.labwork7;

/**
 * Defines methods that are used to change state of connection
 */
public interface ConnectionState {
    /**
     * Method that changes state to "LISTENING"
     */
    public void open();

    /**
     * Method that changes state to "ESTABLISHED"
     */

    public void establish();

    /**
     * Method that changes state to "CLOSED"
     */
    public void close();
}
