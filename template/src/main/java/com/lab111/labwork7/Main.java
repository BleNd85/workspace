package main.java.com.lab111.labwork7;
/*3. Визначити специфікації класу, що подає мережеве з'єднання протоколу TCP. Реалізувати
зміну поведінки в залежності від стану з'єднання (LISTENING, ESTABLISHED, CLOSED)
без використання громіздких умовних операторів.*/
public class Main {
    public static void main(String[] args) {
        TCPConnection tcpConnection = new TCPConnection();
        tcpConnection.openConnection();
        tcpConnection.openConnection();
        tcpConnection.closeConnection();
        tcpConnection.establishConnection();
        tcpConnection.closeConnection();
        tcpConnection.openConnection();
        tcpConnection.establishConnection();
        tcpConnection.closeConnection();
    }
}
