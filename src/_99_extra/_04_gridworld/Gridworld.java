package _99_extra._04_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
	public static void main(String[] args) {
		World world = new World();
		Bug randBug = new Bug();
		Color BLUE = Color.blue;
		Location randBugLoc = world.getRandomEmptyLocation();
		
		world.show();
		
		world.add(new Location(1,1), new Bug());
		world.add(randBugLoc, randBug);
		if(randBugLoc.getCol() < 9)
		{
			world.add(new Location(randBugLoc.getRow(), randBugLoc.getCol()+1), new Flower());
		}
		if(randBugLoc.getCol() > 0)
		{
			world.add(new Location(randBugLoc.getRow(), randBugLoc.getCol()-1), new Flower());
		}
		randBug.setColor(BLUE);
		
		randBug.turn();
		randBug.turn();
		
		while (world.getRandomEmptyLocation() != null)
		{
			Location loc = world.getRandomEmptyLocation();
			Flower flower = new Flower();
			world.add(loc, flower);
			if (loc.getRow() % 2 == 0)
			{
				flower.setColor(Color.red);
			}
			else
			{
				flower.setColor(Color.white);
			}
		}
	}
}
