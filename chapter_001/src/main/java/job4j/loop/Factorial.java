package loop;
/**
* ������ ���������� �����.
* @author dlukyanchuk
* @since 19.03.2017
* @version 1
*/
public class Factorial {
/**
* ����� ��� �������� ���������� �����.
* @param n - ����� ��� �������� ������������� ���������
* @return factor - ��������� ������� ���������� �����
*/
	public int mult(int n) {
		int factor = 1;
		for (int i = 1; i <= n; i++) {
			factor *= i;
		}
	return factor;
	}
}