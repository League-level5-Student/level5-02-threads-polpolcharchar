package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
	public static void main(String[] args) {
		Robot r[] = new Robot[5];
		for(int i = 0; i < r.length; i++) {
			r[i] = new Robot();
			r[i].setX(i*100 + 50);
			r[i].setY(1000);
			r[i].setAngle(0);
			r[i].setSpeed(10);
		}
		Random random = new Random();
		Thread t[] = new Thread[5];
		t[0] = new Thread(()->{
			while(r[0].getY() > 100) {
				r[0].move(random.nextInt(5)+1);
			}
		});
		t[1] = new Thread(()->{
			while(r[1].getY() > 100) {
				r[1].move(random.nextInt(5)+1);
			}
		});
		t[2] = new Thread(()->{
			while(r[2].getY() > 100) {
				r[2].move(random.nextInt(5)+1);
			}
		});
		t[3] = new Thread(()->{
			while(r[3].getY() > 100) {
				r[3].move(random.nextInt(5)+1);
			}
		});
		t[4] = new Thread(()->{
			while(r[4].getY() > 100) {
				r[4].move(random.nextInt(5)+1);
			}
		});
		for(int i = 0; i < t.length; i++) {
			t[i].start();
		}
		boolean loop = true;
		int winner = -1;
		while(loop) {
			for(int i = 0; i < r.length; i++) {
				if(r[i].getY() <= 100) {
					loop = false;
					winner = i;
				}
			}
		}
		for(int i = 0; i < t.length; i++) {
			t[i].suspend();
		}
		t = null;
		System.out.println("Robot #" + (winner + 1) + " wins!");
	}
}
