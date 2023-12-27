package server;

public interface ServerConnection {
    boolean connectUser(ClientGUI clientGUI);
    void disconnectUser(ClientGUI clientGUI);
    void answerAll(String text);
}
