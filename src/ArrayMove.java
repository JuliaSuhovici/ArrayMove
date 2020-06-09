
public class ArrayMove {

	public static void main(String[] args) {

		  Integer[] data = { 100, 200, 300, 400, null };
		  data = moveToBeginning(data);
		  print(data);
		  
		  data = moveToEnding(data);
		  print(data);

	}
	
	// Метод перемещает последний элемент в начало массива.
	
//  Пробегаем массив с конца, поэтому начальное значение i 
//	должно быть равно индексу последнего элемента
//	(длинна массива-1, потому что индексация с 0).
//	i = 4;
//	
//	Цикл - пока i>0 выполняется условие:
//		array[i--] = array[i];
//	
//	Из-за постфиксной формы декремента значение i сначала передается, а затем уменьшается.
//	То есть, на данном примере пошаговое выполнение будет следующим:
//		array[4] = array[3];  ---> i было равно 4. Сначала i передалось в array[i--], а только потом уменьшилось на единицу. 
//									В итоге при следующем использовании i оно уже равно 3.
//									{100, 200, 300, 400, 400}
//		array[3] = array[2];  ---> 3 еще раз уменьшилась на единицу и i уже стало равным 2
//									так просиходит до конца цикла.
//									{100, 200, 300, 300, 400}
//		array[2] = array[1];  ---> 	{100, 200, 200, 300, 400}
//		array[1] = array[0];  --->	{100, 100, 200, 300, 400}
//		Цикл закончен, тк i=0 > 0 - false;
//		i остается равным 0, поэтому элементу массива с индексом 0 (первому элементу)
//		присваиваем null
//		
//		array[0] = null;
//		
//		Результат:
//		{null, 100, 200, 300, 400}
//		
//		
//		Еще проще: мы приравниваем значение предыдущего элемента текущему, пока не дойдем до первого.
//		Затем приравниваем первый элемент к null.
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
