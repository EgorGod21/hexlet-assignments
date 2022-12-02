package exercise.connections;

import exercise.TcpConnection;

public class Example {
    public static void main(String[] args) {
        TcpConnection connection = new TcpConnection("132.223.243.88", 2342);
        connection.connect();
        connection.getCurrentState(); // "connected"
        connection.write("data");
        connection.disconnect();
        connection.getCurrentState(); // "disconnected"
// Выводит на экран сообщение об ошибке
        connection.disconnect();
    }
}
