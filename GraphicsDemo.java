package gameproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Timestamp;

public class GraphicsDemo extends JPanel implements ActionListener {
	JLabel label;
    Timer timer = new Timer(1, this);
    int seconds = 60;
    int x = 1;
    int y = 1;
    int velocityX = 1;
    int velocityY = 1;

    public GraphicsDemo(){
        label = new JLabel(new ImageIcon("1eegax.jpg"));
        label.setSize(500,500);
        label.setLocation(200,200);
        this.setLayout(null);
        this.add(label);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent event){
       if (x>= 1200 || x<=0){
           velocityX = -velocityX;
        }
        x = x + velocityX;
        repaint();

        /*
        if (seconds == 60){
            System.out.println(seconds+" seconds remain.");
        }else if (seconds == 45){
            System.out.println(seconds+" seconds remain.");
        }else if (seconds == 30){
            System.out.println(seconds+" seconds remain.");
        }else if (seconds == 10){
            System.out.println(seconds+" seconds remain.");
        }else if (seconds == 0){
            System.out.println("Your time is up !");
            timer.stop();
        }
        seconds--;
         */

    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        Graphics2D g2D = (Graphics2D) g;

        g2D.setColor(Color.yellow);
        g2D.fillOval(x,0,100,100);

        //int[] xPoints = {50,100,150,200,250,300,350};
        //int[] yPoints = {350,250,275,200,275,150,100};
        //int nPoints = xPoints.length;
        //int[] x = {100,200,300};
        //int[] y = {300,127,300};
        /*
        int initAngle = 0;
        for (int i = 0 ; i <= 6 ; i++){
            g2D.setColor(Color.RED);
            g2D.fillArc(50,50,300,300,initAngle,30);
            initAngle = initAngle+30;
            g2D.setColor(Color.PINK);
            g2D.fillArc(50,50,300,300,initAngle,30);
            initAngle = initAngle + 30;
        }
        g2D.setColor(Color.BLACK);
        g2D.setStroke(new BasicStroke(6));
        g2D.drawPolygon(new int[] {320, 410, 410}, new int[] {200, 190, 210}, 3);
        //g2D.fillPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
        //g2D.fillPolygon(new int[] {350, 360, 370}, new int[] {200, 120, 200}, 3);
        g2D.setColor(Color.BLUE);
        g2D.fillPolygon(new int[] {320, 410, 410}, new int[] {200, 190, 210}, 3);
        g2D.setFont(new Font("Comic Sans",Font.ITALIC,25));
        g2D.drawString("STONKY BOI",300,450);
         */
        //g2D.drawLine(0,0,420,420);
        //g2D.drawPolyline(xPoints,yPoints,nPoints);
        //g2D.setFont(new Font("Comic Sans",Font.ITALIC,25));
        //g2D.drawString("STONKY BOI",100,100);
        //g2D.drawPolygon(x,y,3);





    }
}
