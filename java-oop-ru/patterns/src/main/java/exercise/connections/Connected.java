package exercise.connections;

import exercise.TcpConnection;

public class Connected implements Connection{
    TcpConnection connection;

    public Connected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public String getCurrentState() {
        return "connected";
    }

    @Override
    public void connect() {
        System.out.println("Error! Connection already connected");
    }

    @Override
    public void disconnect() {
     connection.setConnection(new Disconnected(connection));
    }

    @Override
    public void write(String st) {
     connection.write(st);
    }
}