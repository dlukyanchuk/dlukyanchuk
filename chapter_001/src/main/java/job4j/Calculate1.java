package job4j;
/**
* Class Класс для вычиления арифметических операций.
* @author dlukyanchuk
* @since 13.02.2017
* @version 1
*/
public class Calculate1 {
/**
* Создание класса Calculate1.
*/

	private double result;
/**
* Создание метода сложение.
* @param a первое число
* @param b второе число
*/
		void add(double a, double b) {
		this.result = a + b;
		}

/**
* Создание метода вычитание.
* @param a первое число
* @param b второе число
*/
	void sub(double a, double b) {
		this.result = a - b;
		}
/**
* Создание метода деление.
* @param a первое число
* @param b второе число
*/
	void div(double a, double b) {
		this.result = a / b;
		}

/**
* Создание метода умножение.
* @param a первое число
* @param b второе число
*/
	void mult(double a, double b) {
		this.result = a * b;
		}

/**
* Создание метода результат.
* @return результат
*/
		double getResult() {
		return (result);
		}
};