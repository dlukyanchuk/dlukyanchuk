package loop;
/**
* ����� ������ ����� � ���������.
* @author dlukyanchuk
* @since 19.03.2017
* @version 1
*/
public class Counter {
/**
* ����� ��� �������� ������ ����� � ���������.
* @param start - ������ ���������
* @param finish - ��������� ���������
* @return summ - ����� ������ ����� ���������
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