package loop;
/**
* Сумма четных чисел в диапазоне.
* @author dlukyanchuk
* @since 19.03.2017
* @version 1
*/
public class Counter {
/**
* Метод для подсчеты четных чисел в диапазоне.
* @param start - начало диапазона
* @param finish - окончание диапазона
* @return summ - сумма четных чисел диапазона
*/
	public int add(int start, int finish) {
		int summ = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				summ += i;
			}
		}
	return summ;
	}
}