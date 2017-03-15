package job4j;
/**
* Класс для нахождения максимального числа из трех.
* @author dlukyanchuk
* @since 13.02.2017
* @version 1
*/
public class Max2 {
/**
* Метод для определения максимального числа из трех.
* Метод max - определения максимального числа из двух, описан в классе Max
* @param first - первое число
* @param second - второе число
* @param third - третье число
* @return  - результат
*/
	public int max2(int first, int second, int third) {
		Max max = new Max();
		return max.max(first, max.max(second, third));
}
}