public class ConditionalStatement {
	
	public static void main(String[] args){

		int age = 26; 
		boolean male = true;
		double growth = 1.79;
		char firstNameChar = 'E';

		if(age > 20) {
			System.out.println("Возраст больше двадцати");
		}
		
		if(male) {
			System.out.println("Мужской пол");
		}
		
		if(!male) {
			System.out.println("НЕ мужской пол");
		}
		
		if(growth < 1.80) {
			System.out.println("Рост: " + growth);
		} else {
			System.out.println("Рост больше 1.80");
		}

		if(firstNameChar == 'M') {
			System.out.println("Первая буква имени равна М");
		} else if (firstNameChar == 'I') {
			System.out.println("Первая буква имениа равна I");
		} else {
			System.out.println("Первая буква имени не равна M и I");
		}
	}
}