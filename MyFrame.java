package gameproject;
import javax.swing.*;
public class MyFrame extends JFrame {
	   GraphicsDemo graphicsDemo = new GraphicsDemo();

	    public MyFrame(){
	        this.setSize(1200,1200);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.add(graphicsDemo);
	        this.setVisible(true);
	    }
}
