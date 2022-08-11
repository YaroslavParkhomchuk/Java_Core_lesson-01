package ua.lviv.lgs;

public class Homework_01 {
	public static void main(String[] args) {
		
		// Завдання 1
		
		Byte a1 = 3;
		Short a2 = 3;
		Integer a3 = 3;
		Long a4 = 3L;
		Character a5 = 'a';
		Float a6 = 3F;
		Double a7 = 3.0;
		Boolean a8 = false;
		
		
		// Завдання 2
		
		System.out.println("Завдання 2: ");
		System.out.println();
		
		System.out.println("Byte: min = " + a1.MIN_VALUE + ", max = " + a1.MAX_VALUE);
		System.out.println("Short: min = " + a2.MIN_VALUE + ", max = " + a2.MAX_VALUE);
		System.out.println("Integer: min = " + a3.MIN_VALUE + ", max = " + a3.MAX_VALUE);
		System.out.println("Long: min = " + a4.MIN_VALUE + ", max = " + a4.MAX_VALUE);
		System.out.println("Character: min = " + (a5.MIN_VALUE + 0) + ", max = " + (a5.MAX_VALUE + 0));
		System.out.println("Float: min = " + a6.MIN_VALUE + ", max = " + a6.MAX_VALUE);
		System.out.println("Double: min = " + a7.MIN_VALUE + ", max = " + a7.MAX_VALUE);
		System.out.println("Boolean: " + a8.FALSE + " or " + a8.TRUE);
		
		
		// Завдання 3
		
		int [] array = {14, 2, 15, 6, 77, 34, 22, 9, 86, 51};
		
		int min = array[0];
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) 
		{
			if (min > array[i])
			{
				min = array[i];
			}
			
			if (max < array[i])
			{
				max = array[i];
			}
		}
		
		System.out.println();
		System.out.println("Завдання 3: ");
		System.out.println();
		System.out.println("Масив: ");
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Найменше число в масиві: " + min + ", найбільше число в масиві: " + max);
	}
}
