import java.util.Scanner;

public class Calculator {
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);

		int firstElem = 0;
		int secondElem = 0;
		int typeOperation = 0;

		System.out.println("Введите число 1:");

		firstElem = in.nextInt();

		System.out.println("Введите число 2:");

		secondElem = in.nextInt();

		System.out.println("Выберите тип операции:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n5. Возвести в степень\n6. Вычислить остаток от деления");

		typeOperation = in.nextInt();

		if(typeOperation == 1) {
			System.out.println(firstElem + secondElem);
		}
		if(typeOperation == 2) {
			System.out.println(firstElem - secondElem);
		}
		if(typeOperation == 3) {
			System.out.println(firstElem * secondElem);
		}
		if(typeOperation == 4) {
			System.out.println(firstElem / secondElem);
		}
		if(typeOperation == 5) {
			int result = 1;
			for(int i = 0; i < secondElem; i++){
				result = firstElem * result;
			}
			System.out.println(result); 
		}
		if(typeOperation == 6) {
			System.out.println(firstElem % secondElem);
		}
	}
}
