package exercise.connections;

import exercise.TcpConnection;

public class Disconnected implements Connection{
    TcpConnection tcpConnection;
    public Disconnected(TcpConnection tcpConnection){
        this.tcpConnection=tcpConnection;
    }
    @Override
    public String getCurrentState() {
        return "disconnected";
    }

    @Override
    public void connect() {
     TcpConnection tcpConnection=this.tcpConnection;
     tcpConnection.connect();
    }

    @Override
    public void disconnect() {
        System.out.println("Error! Connection already disconnected");
    }

    @Override
    public void write(String st) {
        TcpConnection tcpConnection1=this.tcpConnection;
        tcpConnection1.write(st);
    }
}
