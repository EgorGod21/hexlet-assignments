package exercise.connections;

import exercise.TcpConnection;

public class Disconnected implements Connection{
  TcpConnection connection;

  public Disconnected(TcpConnection connection) {
    this.connection = connection;
  }

  @Override
    public String getCurrentState() {
        return "disconnected";
    }

    @Override
    public void connect() {
     connection.setConnection(new Connected(connection));
    }

    @Override
    public void disconnect() {
      System.out.println("Error! Connection already disconnected");
    }

    @Override
    public void write(String st) {
     connection.write(st);
    }
}