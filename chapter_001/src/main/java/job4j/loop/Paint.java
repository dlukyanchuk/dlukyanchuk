package loop;
/**
* ����� ������ ����� � ���������.
* @author dlukyanchuk
* @since 19.03.2017
* @version 1
*/
public class Paint {
/**
* ����� ��� ��������� ��������.
* @param h - ������ ��������
*/
	public String pyramid(int h) {
		for (int high = 1; high <= h; h++) {
			for (int length = 1; length <= high * 2 - 1; length++) {									if (length >= h - high + 1 && length < h + high) {
					System.out.print("^");
			} else {
		System.out.print(" ");
				}

}
		System.out.println();
}
}