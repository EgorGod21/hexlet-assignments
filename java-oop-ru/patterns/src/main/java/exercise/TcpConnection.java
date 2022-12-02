package exercise;
import exercise.connections.Connected;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

public class TcpConnection implements Connection{
    private List<String> list=new ArrayList<>();
    private Connection connection;
    private String ip;
    private int port;
    public TcpConnection(String ip, int port){
      this.ip=ip;
      this.port=port;

    }

    @Override
    public String getCurrentState() {
        return connection.getCurrentState();
    }

    @Override
    public void connect() {
        if (connection==null || connection instanceof Disconnected){
      connection=new Connected(this);}
        else
      connection.connect();
    }

    @Override
    public void disconnect() {
        if (connection==null || connection instanceof Connected){
      connection=new Disconnected(this);}
        else
      connection.disconnect();
    }

    @Override
    public void write(String st) {
        list.add(st);
    }
}
