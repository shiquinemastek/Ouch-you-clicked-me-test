import javax.swing.*;

public class GuiBox {
    public static void main(String [] args){
        JFrame window = new JFrame("Bryson's Window");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me");
        panel.add(button);
        window.add(panel);
        window.setSize(300,100);
        button.addActionListener(e -> System.out.println("Ouch you clicked Me!"));
        window.setVisible(true);

    }

}
