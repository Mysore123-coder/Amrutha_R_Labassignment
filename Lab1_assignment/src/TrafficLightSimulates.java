/**
 * author: Amrutha R
 * desc: Traffic light Simulator
 */
import java.util.*;

public class TrafficLightSimulates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Traffic light Simulation\n");
		System.out.println("1.Red\n2.Yellow\n3.Green\n Enter your choice :");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		s.close();
		switch(choice) {
		case 1: System.out.println("Stop");
				break;
		case 2: System.out.println("Ready");
				break;
		case 3: System.out.println("Go");
				break;
		default: System.out.println("Enter valid choice");
		}
	}

}
