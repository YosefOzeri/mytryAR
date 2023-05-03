import javax.swing.*;

public class Window extends JFrame {

    public Window(){
        this.setSize(500,1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new PanelOne(0,0,500,800));
        this.setVisible(true);
    }




}
