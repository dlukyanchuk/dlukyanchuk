package job4j;
/**
* ����� ��� ���������� ������������� ����� �� ����.
* @author dlukyanchuk
* @since 13.02.2017
* @version 1
*/
public class Max2 {
/**
* ����� ��� ����������� ������������� ����� �� ����.
* ����� max - ����������� ������������� ����� �� ����, ������ � ������ Max
* @param first - ������ �����
* @param second - ������ �����
* @param third - ������ �����
* @return  - ���������
*/
	public int max2(int first, int second, int third) {
		Max max = new Max();
		return max.max(first, max.max(second, third));
}
}