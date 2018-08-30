package ch.adesso.pathfinder;

import java.awt.Point;

/*
 Die Hand-Methode ist die bekannteste Regel, einen Irrgarten zu durchqueren.
 Man legt einfach seine rechte oder linke Hand an eine Wand des Irrgartens und hält dann beim Durchlaufen ständigen Kontakt.
 Falls alle Mauern zusammenhängen oder mit der Außenseite verbunden sind – das heißt, der Irrgarten ist „einfach zusammenhängend“ –, garantiert die Hand-Methode,
 dass man entweder einen anderen Ausgang erreicht, oder wieder zum Eingang zurückkehrt.
 */
public class PathFinderLogicHand implements PathFinderLogic {

	@Override
	public DIRECTION getNewDirection(int[][] labyrinth, Point position, DIRECTION oldDirection) {
		return null;
	}

}
