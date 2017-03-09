package job4j;
/**
* Class Класс для вычиления расстояния между точками.
* @author dlukyanchuk
* @since 27.02.2017
* @version 1
*/
public class Point {
/**
* TODO.
*/
	private double x;
/**
* TODO.
*/
	private double y;
/**
* Конструктор Point(double x, double y).
* @param x - value
* @param y - value
*/
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
}
/**
* Метод distanceTo - Рассчет расстояния между двумя точками.
* @param point - точками
* @return - расстояние
*/
			public double distanceTo(Point point) {
				return Math.sqrt(Math.pov(point.x - this.x, 2) + Math.pov(point.y - this.y, 2));
}
}

