import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleChatClient {

    private JTextField outgoing;
    private JTextArea ingoing;
    private PrintWriter writer;
    private BufferedReader reader;

    final private String name;

    public static int numberOfClients = 0;

    public  static String defaultName = "Client number: " + numberOfClients;

    public SimpleChatClient(String name) {
        numberOfClients++;
        if(name == null) {
            this.name = defaultName;
        } else {
            this.name = name;
        }
    }

    public void go() {
        // call the setUpNetworking() method
        // make gui and register a listener with the send button
        setUpNetworking();

        JFrame frame = new JFrame("Chat Client");
        JPanel panel = new JPanel();

        ingoing = new JTextArea(10, 20);
        ingoing.setEditable(false);
        panel.add(ingoing);

        outgoing = new JTextField(20); // create the text field
        panel.add(outgoing);           // add it to the panel

        JButton sendButton = new JButton("Send");
        panel.add(sendButton);
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.execute(this::readMessage);
        sendButton.addActionListener(e -> {
            threadPool.execute(()->sendMessage());
        });

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    private void setUpNetworking() {
        // open a SocketChannel to the server
        // make a PrintWriter and assign to writer instance variable
        try {
            SocketChannel clientChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 5000));
            writer = new PrintWriter(Channels.newWriter(clientChannel, StandardCharsets.UTF_8));
            Reader addressReader = Channels.newReader(clientChannel, StandardCharsets.UTF_8);
            reader = new BufferedReader(addressReader);
            System.out.println("Networking established.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private void sendMessage() {
        String text = outgoing.getText();
        writer.println(this.name +": " + text + "\n");
        writer.flush();
        outgoing.setText("");
        outgoing.requestFocus();
    }
    private void readMessage() {
        while (true) {
            try {
                ingoing.append(reader.readLine());
                ingoing.append("\n");
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
    }

    public static void main(String[] args) {
        new SimpleChatClient("Ahmed").go();
        new SimpleChatClient("Mohamed").go();
    }
}
