package triangle;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double a, b, c;

		System.out.println("Entre com as medidas do triângulo x");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		Triangle triangleX = new Triangle(a, b, c);

		System.out.println("Entre com as medidas do triângulo y");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		Triangle triangleY = new Triangle(a, b, c);
		double areaX = triangleX.area();
		double areaY = triangleY.area();

		System.out.println("Triângulo X área: " + triangleX);
		System.out.println("Triângulo Y área: " + triangleY);

		if (areaX > areaY) {
			System.out.println("Maior área: X");
		} else {
			System.out.println("Maior área: Y");
		}

		scan.close();

	}
}
