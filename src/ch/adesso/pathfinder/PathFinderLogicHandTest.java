package ch.adesso.pathfinder;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import ch.adesso.pathfinder.PathFinderLogic.DIRECTION;

public class PathFinderLogicHandTest {

	@Test
	public void getNewDirection_Right_Up() {
		String labyrinth =
				"X X" + 
				"S  " + 
				"X X";
		assertEquals(DIRECTION.UP, getNewDirection(labyrinth));
	}

	private DIRECTION getNewDirection(String labyrinthString) {
		int[][] labyrinth = buildLabyrinth(labyrinthString);
		PathFinderLogicHand pathFinder = new PathFinderLogicHand();
		Point position = new Point(1, 1);
		DIRECTION oldDirection = null;
		if (labyrinthString.charAt(1) == Labyrinth.START_CHARACTER) {
			oldDirection = DIRECTION.DOWN;
		} else if (labyrinthString.charAt(3) == Labyrinth.START_CHARACTER) {
			oldDirection = DIRECTION.RIGHT;
		} else if (labyrinthString.charAt(5) == Labyrinth.START_CHARACTER) {
			oldDirection = DIRECTION.LEFT;
		} else if (labyrinthString.charAt(7) == Labyrinth.START_CHARACTER) {
			oldDirection = DIRECTION.UP;
		}
		return pathFinder.getNewDirection(labyrinth, position , oldDirection);
	}

	private int[][] buildLabyrinth(String labyrinthString) {
		int[][] labyrinth = new int[3][3];
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				char character = labyrinthString.charAt(x + y * 3);
				if (character == Labyrinth.BORDER_CHARACTER) {
					labyrinth[x][y] = PathFinder.BORDER;
				} else {
					labyrinth[x][y] = PathFinder.EMPTY;
				}
			}
		}
		return labyrinth;
	}

}
