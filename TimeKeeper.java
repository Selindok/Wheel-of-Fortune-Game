package gameproject;
import java.util.TimerTask;
public class TimeKeeper extends TimerTask {
	 public static int ticksRemaining = 25;
	    public void run(){
	        switch (ticksRemaining){
	            case 20:{
	                System.out.println("You have 20 seconds.");
	                ticksRemaining--;
	                break;
	            }

	            case 10:{
	                System.out.println("You have 10 seconds.");
	                ticksRemaining--;
	                break;
	            }

	            case 5:{
	                System.out.println("You have 5 seconds left !");
	                ticksRemaining--;
	                break;
	            }
	            case 0:{
	                System.out.println("You are out of time !");
	                cancel();
	                break;
	            }
	            default:{
	                ticksRemaining--;
	                break;
	            }


	        }
	    }
}
