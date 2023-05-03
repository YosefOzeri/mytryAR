import javax.swing.*;
import java.awt.*;

public class PanelTwo extends JPanel {
    private JLabel ball;
    private JLabel smallBall;
    private JLabel blast;
    public PanelTwo(int width,int height,int x, int y){



        this.setSize(width,height);
        this.setLocation(x,y);
        this.setLayout(null);
        this.setBackground(Color.red);

        this.blast = new JLabel("Blast",JLabel.CENTER);
        this.blast.setBounds(5,0,280,100);
        this.blast.setFont(new Font("arial",Font.BOLD,60));
        this.add(this.blast, BorderLayout.CENTER);
        this.blast.setVisible(true);

//        this.smallBall = new JLabel("Blast",JLabel.CENTER);
//        this.smallBall.setBounds(this.blast.getX()+5,this.blast.getY()+5,280,100);
//        this.smallBall.setFont(new Font("arial",Font.BOLD,60));
//        this.add(this.smallBall, BorderLayout.CENTER);
//        this.smallBall.setVisible(true);

        this.ball = new JLabel("Ball",JLabel.CENTER);
        this.ball.setBounds(this.blast.getX()+108,this.blast.getY()-30,100,100);
        this.ball.setFont(new Font("arial",Font.BOLD,35));
        this.add(this.ball, BorderLayout.CENTER);
        this.ball.setVisible(true);


        this.setOpaque(true);
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.drawRect(30,100,100,100);
        graphics2D.drawRect(60,130,100,100);
        graphics2D.drawLine(60,130,100,100);


    }
}
