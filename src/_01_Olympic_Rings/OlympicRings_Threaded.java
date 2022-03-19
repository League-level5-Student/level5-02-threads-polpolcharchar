package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

	
	
	public static void main(String[] args) {
		int scale = 5;
		int moveAmount = 5;
		Robot r1 = new Robot(50 * scale, 50 * scale);
		Robot r2 = new Robot(100 * scale, 100 * scale);
		Robot r3 = new Robot(150 * scale, 50 * scale);
		Robot r4 = new Robot(200 * scale, 100 * scale);
		Robot r5 = new Robot(250 * scale, 50 * scale);
		
		r1.penDown();
		r2.penDown();
		r3.penDown();
		r4.penDown();
		r5.penDown();
		
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 360; i++) {
				r1.move(moveAmount);
				r1.turn(1);
			}
			r1.hide();
		});
		Thread t2 = new Thread(()->{
			for(int i = 0; i < 360; i++) {
				r2.move(moveAmount);
				r2.turn(1);
			}
			r2.hide();
		});
		Thread t3 = new Thread(()->{
			for(int i = 0; i < 360; i++) {
				r3.move(moveAmount);
				r3.turn(1);
			}
			r3.hide();
		});
		Thread t4 = new Thread(()->{
			for(int i = 0; i < 360; i++) {
				r4.move(moveAmount);
				r4.turn(1);
			}
			r4.hide();
		});
		Thread t5 = new Thread(()->{
			for(int i = 0; i < 360; i++) {
				r5.move(moveAmount);
				r5.turn(1);
			}
			r5.hide();
			System.out.println("Finished!");
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println("All started");
	
	}
}

