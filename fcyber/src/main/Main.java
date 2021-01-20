
package main;

public class Main {

	public static void main(String[] args) {
		// is prime
		int number0 = 13;  // sayı 
		int remainder = number0 % 2;   //yüzde operatörü
		boolean isPrime = true;
		if (number0 == 1) {
			System.out.println("Number=" + remainder);
			System.out.println("The number is not prime");
			System.out.println("Invalid number"); 	
			return;

		}

		if (number0 < 1) {
			System.out.println("Number=" + remainder); //sayı=kalan 
			System.out.println("The number is not prime");
			System.out.println("Invalid number");
			return;
		}

		for (int i = 2; i < number0; i++) {

			if (number0 % 2 == 0) {  //neden 2 den başlıyoruzz çünkü en küçükasal sayı 2 dir

				isPrime = false;

			}

		}

		if (isPrime) {
			System.out.println("The number is prime"); //sayı asal ise

		} else {
			System.out.println("The number is not prime"); //sayı asal değil

		}

	}
}
