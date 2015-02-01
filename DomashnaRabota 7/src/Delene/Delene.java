package Delene;

import java.util.*;

public class Delene {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numberOne = "5.7";
		String numberTwo = "1000";

		try {
			double number1 = Double.parseDouble(numberOne);
			double number2 = Double.parseDouble(numberTwo);
			double rezult = number1 / number2;
			System.out.println("Rezultat: " + number1 + "/" + number2 + "= " + rezult);

		} catch (NullPointerException exception) {
			System.out.println("Ne moje da se deli na 0");
		} catch (NumberFormatException exception1) {
			System.out.println("Greshka pri parsvaneto");
		}

		catch (Exception exception2) {
			System.out.println("Izkluchenie" + exception2.getMessage());
		}
		input.close();

	}
}
