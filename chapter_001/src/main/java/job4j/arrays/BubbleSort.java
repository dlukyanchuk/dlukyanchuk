package arrays;
/**
* ��������������� �������.
* @author dlukyanchuk
* @since 19.03.2017
* @version 1
*/


public class BubbleSort {
/**
* ����������� ����� ��� ���������� �������.
* @param array - ������ ������
* @return - ��������� ������
*/
	public int[] sort(int[] array) {
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int t = array[j];
					array [j] = array[j + 1];
					array [j + 1] = t;
				}
			}
		}
		return array;
}
}