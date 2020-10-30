package triangle;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double a, b, c;

		System.out.println("Entre com as medidas do tri�ngulo x");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		Triangle triangleX = new Triangle(a, b, c);

		System.out.println("Entre com as medidas do tri�ngulo y");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		Triangle triangleY = new Triangle(a, b, c);
		double areaX = triangleX.area();
		double areaY = triangleY.area();

		System.out.println("Tri�ngulo X �rea: " + triangleX);
		System.out.println("Tri�ngulo Y �rea: " + triangleY);

		if (areaX > areaY) {
			System.out.println("Maior �rea: X");
		} else {
			System.out.println("Maior �rea: Y");
		}

		scan.close();

	}
}
