package job4j;
/**
* Class ����� ��� ��������� �������������� ��������.
* @author dlukyanchuk
* @since 13.02.2017
* @version 1
*/
public class Calculate1 {
/**
* �������� ������ Calculate1.
*/

	private double result;
/**
* �������� ������ ��������.
* @param a ������ �����
* @param b ������ �����
*/
		void add(double a, double b) {
		this.result = a + b;
		}

/**
* �������� ������ ���������.
* @param a ������ �����
* @param b ������ �����
*/
	void sub(double a, double b) {
		this.result = a - b;
		}
/**
* �������� ������ �������.
* @param a ������ �����
* @param b ������ �����
*/
	void div(double a, double b) {
		this.result = a / b;
		}

/**
* �������� ������ ���������.
* @param a ������ �����
* @param b ������ �����
*/
	void mult(double a, double b) {
		this.result = a * b;
		}

/**
* �������� ������ ���������.
* @return ���������
*/
		double getResult() {
		return (result);
		}
};