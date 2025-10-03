import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class SimpleChatClientA {
    private JTextField outgoing;
    private PrintWriter writer;

    public void go() {
        // call the setUpNetworking() method
        // make gui and register a listener with the send button
        setUpNetworking();

        JFrame frame = new JFrame("Chat Client");
        JPanel panel = new JPanel();

        outgoing = new JTextField(20); // create the text field
        panel.add(outgoing);           // add it to the panel

        JButton sendButton = new JButton("Send");
        panel.add(sendButton);
        sendButton.addActionListener(e -> sendMessage());

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    private void setUpNetworking() {
        // open a SocketChannel to the server
        // make a PrintWriter and assign to writer instance variable
        try (SocketChannel clientChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 5000))) {
            writer = new PrintWriter(Channels.newWriter(clientChannel, StandardCharsets.UTF_8));
            System.out.println("Networking established.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private void sendMessage() {
        // get the text from the text field and
        // send it to the server using the writer (a PrintWriter)
        String text = outgoing.getText();
        writer.println(text);
        writer.flush();
        outgoing.setText("");
        outgoing.requestFocus();
    }

    public static void main(String[] args) {
        SimpleChatClientA A = new SimpleChatClientA();
        A.go();
    }
}