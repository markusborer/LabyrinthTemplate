package ch.adesso.pathfinder;

import java.awt.Point;

public interface PathFinderLogic {

	enum DIRECTION {
		RIGHT, LEFT, UP, DOWN
	}

	DIRECTION getNewDirection(int[][] labyrinth, Point position, DIRECTION oldDirection);

}
