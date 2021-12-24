import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vivek {
    private JButton sendButton;
    private JTextField textField1;
    private JTextField textField2;

    public vivek() {
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"hello world");
            }
        });
    }
}
