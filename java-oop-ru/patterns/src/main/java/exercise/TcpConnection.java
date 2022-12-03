package exercise;
import exercise.connections.Connected;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

public class TcpConnection implements Connection{
    Connection connection;
    private String id;
    private int port;
    private List<String> list=new ArrayList<>();

    public TcpConnection(String id, int port) {
        this.id = id;
        this.port = port;
        connection=new Disconnected(this);
    }

    @Override
    public String getCurrentState() {
        return connection.getCurrentState();
    }

    @Override
    public void connect() {
     connection.connect();
    }

    @Override
    public void disconnect() {
     connection.disconnect();
    }

    @Override
    public void write(String st) {
      list.add(st);
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}