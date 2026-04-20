package lab4b;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ImageButtonDemo extends JFrame implements ActionListener {
    JButton btnClock, btnHourGlass;
    JLabel label;

    public ImageButtonDemo() {

        setTitle("Button Image Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load images (Make sure images are in same folder or give full path)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create buttons with images
        btnClock = new JButton(clockIcon);
        btnHourGlass = new JButton(hourGlassIcon);

        // Label to display message
        label = new JLabel("Click a button");

        // Add ActionListener
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Add components to frame
        add(btnClock);
        add(btnHourGlass);
        add(label);

        setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            label.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}