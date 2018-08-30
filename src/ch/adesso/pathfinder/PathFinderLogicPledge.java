package ch.adesso.pathfinder;

import java.awt.Point;

/*
Wenn Eingang und Ausgang mit der Au�enmauer verbunden sind, kann man mit der Rechten-Hand-Regel auch den Weg durch einen nicht einfach zusammenh�ngenden Irrgarten finden.
Startet man jedoch im Inneren des Irrgartens, kann es passieren, dass man mit der Rechte-Hand-Regel ewig an einer Wand entlang im Kreis l�uft, die nicht mit dem Ausgang verbunden ist.
Der Pledge-Algorithmus (benannt nach Jon Pledge aus Exeter) l�st dieses Problem (siehe �Turtle Geometry: the computer as a medium for exploring mathematics�, Abelson & diSessa, 1980).

Der Pledge-Algorithmus, konzipiert, um Hindernisse zu umrunden, ben�tigt eine zuf�llig gew�hlte Zielrichtung.
Trifft man auf ein Hindernis, legt man eine Hand (zum Beispiel immer die rechte) auf das Hindernis und h�lt auf dem weiteren Weg den Kontakt aufrecht.
Dabei z�hlt man die Winkel, um die man sich beim Vorw�rtsgehen von der Zielrichtung wegdreht oder auf die Zielrichtung zudreht.
Ist man wieder in Zielrichtung ausgerichtet und ist die Summe der gemachten Drehungen gleich Null, l�st man die Hand vom Hindernis und geht wieder geradeaus in Zielrichtung.

Die Hand wird nur dann von der Wand des Irrgartens genommen, wenn beide Bedingungen erf�llt sind: �Summe der gemachten Drehungen gleich Null� und �aktuelle Ausrichtung gleich Zielrichtung�.
Dadurch vermeidet der Algorithmus, in Fallen zu tappen, die die Form des Gro�buchstaben �G� besitzen.
Angenommen, man tritt von rechts in das �G� ein und wendet sich beim Treffen auf die linke Wand nach links, dreht man sich um 360 Grad.
W�rde der Algorithmus vorsehen, nun die Wand wieder zu verlassen, da die aktuelle Richtung wieder der Zielrichtung vom Anfang entspricht, so w�re man in einer Endlosschleife gefangen.
Denn verl�sst man die rechte untere Seite des �G� und geht nach links, trifft man wieder auf die gekr�mmte linke Seite des �G� und macht erneut eine vollst�ndige Drehung.
Der Pledge-Algorithmus verl�sst jedoch die rechte untere Seite des �G� nicht, da die �Summe der gemachten Drehungen� nicht Null, sondern 360� ist.
Stattdessen folgt man weiter der Wand, verl�sst das Innere des �G� wieder und nimmt die Hand von der Wand, wenn man sich an der Unterseite des �G�s befindet und wieder nach links blickt.

Falls es sich um einen endlichen und fairen zweidimensionalen Irrgarten handelt, kann man mit dem Pledge-Algorithmus und einem Kompass von jedem Punkt des Irrgartens aus den Weg ins Freie finden.
Umgekehrt funktioniert der Algorithmus jedoch nicht. So ist es mit dem Pledge-Algorithmus im Allgemeinen nicht m�glich, vom Eingang aus ein Ziel im Inneren des Irrgartens zu finden.
*/
public class PathFinderLogicPledge implements PathFinderLogic {

	@Override
	public DIRECTION getNewDirection(int[][] labyrinth, Point position, DIRECTION oldDirection) {
		return null;
	}

}
