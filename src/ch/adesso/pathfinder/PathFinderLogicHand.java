package ch.adesso.pathfinder;

import java.awt.Point;

/*
 Die Hand-Methode ist die bekannteste Regel, einen Irrgarten zu durchqueren.
 Man legt einfach seine rechte oder linke Hand an eine Wand des Irrgartens und h�lt dann beim Durchlaufen st�ndigen Kontakt.
 Falls alle Mauern zusammenh�ngen oder mit der Au�enseite verbunden sind � das hei�t, der Irrgarten ist �einfach zusammenh�ngend� �, garantiert die Hand-Methode,
 dass man entweder einen anderen Ausgang erreicht, oder wieder zum Eingang zur�ckkehrt.
 */
public class PathFinderLogicHand implements PathFinderLogic {

	@Override
	public DIRECTION getNewDirection(int[][] labyrinth, Point position, DIRECTION oldDirection) {
		return null;
	}

}
