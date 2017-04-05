package arrays;
/**
* Разворот массива на 90 градусов.
* @author dlukyanchuk
* @since 26.03.2017
* @version 1
*/


public class RotateArray {
/**
* Метод для разворота двумерного массива на 90 градусов.
* @param array - данный массив
* @return - результат метода
*/
	public int[][] rotate(int[][] array) {
		for (i = 0; i < array.length - 1; i++) {
			for (j = 0; j < array.length - 1; j++) {
				int glass = array[i][j];
				array[i][j] = array[j][array.length-j];
				array[j][array.length-j] = array[array.length-i][array.length-j];
				array[array.length-i][array.length-j] = array[i][array.length-i];
				array[i][array.length-i] = glass;
			}
		}
		return array;
}
}