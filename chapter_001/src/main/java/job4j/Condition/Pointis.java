package Condition;
/**
* ����������� ��������� �����.
* @author dlukyanchuk
* @since 13.02.2017
* @version 1
*/
public class PointIs {
/**
* ���� ������.
* @param x - ���������� ��� �������
* @param y - ���������� ��� �������
*/
private int x;
private int y;
/**
* ����������� ������ PointIs, ������������ ������� ��������� ������.
* @param x - ���������� ��� �������
* @param y - ���������� ��� �������
*/
	public  PointIs(int x, int y) {
		this.x = x;
		this.y = y;
}
/**
* ����� is ��� ����������� �������������� ����� ������.
* @param a - ���������� x
* @param b - ���������� y
* @return - ��������� "��" ��� "���"
*/
	public boolean is(int a, int b) {
		return a * this.x + b - this.y == 0;
}
}