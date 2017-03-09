package job4j;
/**
* Площадь треугольника.
* @author dlukyanchuk
* @since 13.02.2017
* @version 1
*/
public class Triangle {
/**
*TODO.
*/
private Point a;
/**
*TODO.
*/
private Point b;
/**
*TODO.
*/
private Point c;
/**
* public Triangle(Point a, Point b, Point c) - создание треугольника.
* @param a - Point
* @param b - Point
* @param c - Point
*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
}
/**
* Метод area() - рассчет площади треугольника.
* @return - площадь треугольника
*/
		public double area() {
			double areaTriangle = 0;
			double sideA = a.distanceTo(b);
			double sideB = b.distanceTo(c);
			double sideC = c.distanceTo(a);
			if (sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB) {
areaTriangle = Math.sqrt(((sideA + sideB + sideC) / 2) * ((sideA + sideB + sideC) / 2 - sideA) * ((sideA + sideB + sideC) / 2 - sideB) * ((sideA + sideB + sideC) / 2 - sideC));
}
			return areaTriangle;
}
}