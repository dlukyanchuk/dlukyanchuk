package condition;
/**
* ќпределение положени€ точки.
* @author dlukyanchuk
* @since 13.02.2017
* @version 1
*/
public class Pointis {
/**
* ѕоле класса.
* @param x - координата оси абсцисс
* @param y - координата оси ординат
*/
private int x;
private int y;
/**
*  онструктор класса Pointis, определ€ющий текущее состо€ние класса.
* @param x - координата оси абсцисс
* @param y - координата оси ординат
*/
	public  Pointis(int x, int y) {
		this.x = x;
		this.y = y;
}
/**
* ћетод is дл€ определени€ принадлежности точки пр€мой.
* @param a - координата x
* @param b - координата y
* @return - результат "да" или "нет"
*/
	public boolean is(int a, int b) {
		return a * this.x + b - this.y == 0;
}
}