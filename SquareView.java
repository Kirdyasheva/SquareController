import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.event.*;
import java.util.EventListener;

public class SquareView extends JFrame {
    private JTextField input = new JTextField(5);
    private JTextField output = new JTextField(10);
    private JButton sqrBtn = new JButton("Square");
    //
    private SquareModel M;

    public SquareView(SquareModel m) {
        M = m;

        // Layout
        JPanel content = new JPanel();
        content.add(input);
        content.add(sqrBtn);
        content.add(output);
        //
        this.setContentPane(content);
        this.pack();
        //
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getNumber() {
        return input.getText();
    }

    public void setNumber(String v) {
        output.setText(v);
    }

    public void addSquareListener(ActionListener a, KeyListener b) {
        sqrBtn.addActionListener(a);
        input.addKeyListener(b);
        output.addKeyListener(b);
    }
}
