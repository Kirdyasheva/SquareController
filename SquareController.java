import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.*;
import java.util.EventListener;

public class SquareController {
    private SquareView V;
    private SquareModel M;
    private MyListener L;

    public SquareController(SquareModel m, SquareView v) {
        M = m;
        V = v;
        L = new MyListener();
        // adding listener to the view
        v.addSquareListener(L, L);
    }

    class MyListener implements ActionListener, KeyListener{
        public void actionPerformed(ActionEvent e) {
            String userinput = V.getNumber();
            M.setValue(Integer.parseInt(userinput));
            V.setNumber(Integer.toString(M.square()));
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyTyped(KeyEvent e) {
            M.reset();
            V.setNumber(" ");
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
