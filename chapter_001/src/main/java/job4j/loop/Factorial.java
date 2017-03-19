package loop;
/**
* –асчет факториала числа.
* @author dlukyanchuk
* @since 19.03.2017
* @version 1
*/
public class Factorial {
/**
* ћетод дл€ подсчеты факториала числа.
* @param n - число дл€ которого расчитываетс€ факториал
* @return factor - результат расчета факториала числа
*/
	public int mult(int n) {
		int factor = 1;
		for (int i = 1; i <= n; i++) {
			factor *= i;
		}
	return factor;
	}
}