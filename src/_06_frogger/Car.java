package _06_frogger;

import processing.core.PApplet;

public class Car extends PApplet {
	public int x;
	public int y;
	public int size;
	public int speed;
	
	public Car(int x, int y, int size, int speed)
	{
		this.x = x;
		this.y = y;
		this.size = size;
		this.speed = speed;
	}
	
	public void moveLeft()
	{
		x -= speed;
		
		if (x < 0 - size)
		{
			x = Frogger.frog.WIDTH + size;
		}
	}
	
	public void moveRight()
	{
		x += speed;
		
		if (x > Frogger.frog.WIDTH + size)
		{
			x = 0 - size;
		}
	}
	
	void display()
	{
		Frogger.frog.fill(255,0,0);
		Frogger.frog.rect(x , y,  size, 50);
	}
}
