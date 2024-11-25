import javax.swing.*;
import java.awt.event.*;

public class SimpleKeyMouseEvent extends JFrame implements KeyListener, MouseListener {
    private JTextArea textArea;

    public SimpleKeyMouseEvent() {
        setTitle("Key and Mouse Event Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(true);
        add(textArea);

        addKeyListener(this);
        addMouseListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        textArea.append("Key Typed: " + e.getKeyChar() + "\n");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        textArea.append("Key Pressed: " + e.getKeyCode() + "\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        textArea.append("Key Released: " + e.getKeyCode() + "\n");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        textArea.append("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    @Override
    public void mousePressed(MouseEvent e) {}
    
    @Override
    public void mouseReleased(MouseEvent e) {}
    
    @Override
    public void mouseEntered(MouseEvent e) {}
    
    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        SimpleKeyMouseEvent demo = new SimpleKeyMouseEvent();
        demo.setVisible(true);
    }
}
