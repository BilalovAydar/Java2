package lesson4for;

public class ChatServer {
    void start(int port) {
        System.out.println("Server started at port: " + port);
    }

    void fileWrite(String fromName, String toName, String str) {
        System.out.println("write to file: message from " + fromName + " to " + toName + ": " + str);
    }

    void stop() {
        System.out.println("Server stopped");
    }
}
