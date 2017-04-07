package arrays;
/**
* Удаление дубликатов.
* @author dlukyanchuk
* @since 26.03.2017
* @version 1
*/
public class ArrayDublicate {
/**
* Метод для удаления дублированных строк.
* @param array - данный массив
* @return - результат метода
*/
	public String[] remove(String[] array) {
		int copies = 0;
			for (int i = 0; i < array.length - copies; i++) {
				for (int j = i + 1; j < array.length - copies; j++) {
					if (array[i].equals(array[j])) {
						copies += 1;
						String glass = array[j];
						array[j] = array[array.length - copies];
						array[array.length - copies] = glass;
					}
				}
			}
	return Arrays.copyOf(array, array.length - copies);
}
}