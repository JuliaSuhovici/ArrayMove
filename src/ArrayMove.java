
public class ArrayMove {

	public static void main(String[] args) {

		  Integer[] data = { 100, 200, 300, 400, null };
		  data = moveToBeginning(data);
		  print(data);
		  
		  data = moveToEnding(data);
		  print(data);

	}
	
	// ����� ���������� ��������� ������� � ������ �������.
	
//  ��������� ������ � �����, ������� ��������� �������� i 
//	������ ���� ����� ������� ���������� ��������
//	(������ �������-1, ������ ��� ���������� � 0).
//	i = 4;
//	
//	���� - ���� i>0 ����������� �������:
//		array[i--] = array[i];
//	
//	��-�� ����������� ����� ���������� �������� i ������� ����������, � ����� �����������.
//	�� ����, �� ������ ������� ��������� ���������� ����� ���������:
//		array[4] = array[3];  ---> i ���� ����� 4. ������� i ���������� � array[i--], � ������ ����� ����������� �� �������. 
//									� ����� ��� ��������� ������������� i ��� ��� ����� 3.
//									{100, 200, 300, 400, 400}
//		array[3] = array[2];  ---> 3 ��� ��� ����������� �� ������� � i ��� ����� ������ 2
//									��� ���������� �� ����� �����.
//									{100, 200, 300, 300, 400}
//		array[2] = array[1];  ---> 	{100, 200, 200, 300, 400}
//		array[1] = array[0];  --->	{100, 100, 200, 300, 400}
//		���� ��������, �� i=0 > 0 - false;
//		i �������� ������ 0, ������� �������� ������� � �������� 0 (������� ��������)
//		����������� null
//		
//		array[0] = null;
//		
//		���������:
//		{null, 100, 200, 300, 400}
//		
//		
//		��� �����: �� ������������ �������� ����������� �������� ��������, ���� �� ������ �� �������.
//		����� ������������ ������ ������� � null.
//	
	
	
	 public static Integer[] moveToBeginning(Integer[] array){
	        int i;
	        for( i = array.length-1; i > 0; ){
	            array[i--] = array[i];
	        }
	        array[i] = null;
	        return array;
	    }
	 
	 public static Integer[] moveToEnding(Integer[] array){
	        int i;
	        for(i=0; i < array.length-1; ){
	            array[i++] = array[i];
	        }
	        array[i] = null;
	        return array;
	    }

	
	public static void print(Integer[] array) {
		for(Integer i : array) {
			  System.out.print(i + " ");
		  }
		System.out.println();
	}
	 

}
