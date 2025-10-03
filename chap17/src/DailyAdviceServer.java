import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class DailyAdviceServer {
    final private String[] adviceList = {
            "Take smaller bites",
            "Go for the tight jeans. No they do NOT make you look fat.",
            "One word: inappropriate",
            "Just for today, be honest. Tell your boss what you *really* think",
            "You might want to rethink that haircut."};
    private final Random random = new Random();
    private String getAdvice() {
        int nextAdvice = random.nextInt(adviceList.length);
        return adviceList[nextAdvice];
    }
    public void go() {
        try(ServerSocketChannel serverChannel = ServerSocketChannel.open();) {
            serverChannel.bind(new InetSocketAddress(5000));

            while(serverChannel.isOpen()){
                SocketChannel clientChannel = serverChannel.accept();
                SocketAddress clientAddress = clientChannel.getRemoteAddress();
                System.out.println("Connected client: " + clientAddress);
                Writer clientWriter = Channels.newWriter(clientChannel, StandardCharsets.UTF_8);
                BufferedWriter bufferedWriter = new BufferedWriter(clientWriter);
                bufferedWriter.write(getAdvice());
                bufferedWriter.flush();
                clientWriter.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
