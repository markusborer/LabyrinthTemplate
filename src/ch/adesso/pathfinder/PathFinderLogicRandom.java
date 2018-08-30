package ch.adesso.pathfinder;

import java.awt.Point;

/*
Diese triviale Methode kann sogar von einem sehr einfachen Roboter durchgeführt werden.
Sie besteht einfach darin, so lange geradeaus zu gehen, bis man eine Kreuzung erreicht.
Dort entscheidet man sich zufällig für eine Richtung, in die man weitergeht.
Weil man bei dieser Methode Wege möglicherweise mehrmals beschreitet, dauert es im Allgemeinen sehr lange, bis man zum Ausgang kommt.
Dennoch erreicht man diesen immer.
 */
public class PathFinderLogicRandom implements PathFinderLogic {

	@Override
	public DIRECTION getNewDirection(int[][] labyrinth, Point position, DIRECTION oldDirection) {
		return null;
	}

}
