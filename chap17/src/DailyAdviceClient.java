import java.io.BufferedReader;
// import java.io.IO;
import java.io.IOException;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class DailyAdviceClient {
    public void go(String hostAddress, int portNumber) {
        InetSocketAddress address = new InetSocketAddress(hostAddress, portNumber);
        try(SocketChannel socketChannel = SocketChannel.open(address);) {
            Reader addressReader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(addressReader);
            String newAdvice = bufferedReader.readLine();
            System.out.println(newAdvice);
            addressReader.close();
        } catch (IOException ex) {
            System.out.println("Server Error, " + ex.getMessage());
        }
    }
    public static void main(String[] args) {
        DailyAdviceClient daClient = new DailyAdviceClient();
        daClient.go("127.0.0.1", 5000);

        DailyAdviceClient daClientNumTwo = new DailyAdviceClient();
        daClientNumTwo.go("127.0.0.1", 5000);
    }
}
