package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    
    static Frogger frog;
    
    int x = 300;
    int y = 350;
    
    int speed = 5;
    
	Car car1;
	Car car2;
	Car car3;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	car1 = new Car(WIDTH, 300, 100, 8);
    	car2 = new Car(0, 200, 80, 10);
    	car3 = new Car(WIDTH, 100, 150, 5);
    	frog = this;
    }

    @Override
    public void draw() {
        background(0, 255, 255);

    	restrictPos();
    	
    	fill(0, 255,100);
    	
    	ellipse(x, y, 20, 20);
    	
    	
    	
    	if (intersects(car1))
    	{
    		reset();
    	}
    	if (intersects(car2))
    	{
    		reset();
    	}
    	if (intersects(car3))
    	{
    		reset();
    	}
    	
    	car1.display();
    	car1.moveLeft();
    	car2.display();
    	car2.moveRight();
    	car3.display();
    	car3.moveLeft();
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            	y -= speed;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	y += speed;
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            	x += speed;
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            	x -= speed;
            }
        }
    }
    
    public void restrictPos()
    {
    	if(x<0)
    	{
    		x = 0;
    	}
    	if(x>WIDTH)
    	{
    		x = WIDTH;
    	}
    	if(y<0)
    	{
    		y = 0;
    	}
    	if(y>HEIGHT)
    	{
    		y = HEIGHT;
    	}
    }
    
    boolean intersects(Car car) {
    	if ((y > car.y && y < car.y+50) && (x > car.x && x < car.x+car.x)) {
    		return true;
    	}
    	else  {
    		return false;
    	}
    }
    
    public void reset()
    {
    	x = WIDTH / 2;
    	y = HEIGHT - 50;
    }
}
