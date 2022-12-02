package exercise.connections;

import exercise.TcpConnection;

public class Connected implements Connection{
    private TcpConnection tcpConnection;
    public Connected(TcpConnection tcpConnection){
        this.tcpConnection=tcpConnection;
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
        TcpConnection tcpConnection=this.tcpConnection;
        tcpConnection.disconnect();

    }

    @Override
    public void write(String st) {
        TcpConnection tcpConnection1=this.tcpConnection;
        tcpConnection1.write(st);
    }
}
