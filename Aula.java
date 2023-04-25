import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Digite os valores dos lados do triangulo X:");
		double Xa = sc.nextDouble();
		double Xb = sc.nextDouble();
		double Xc = sc.nextDouble();

		System.out.println("Digite os valores dos lados do triangulo Y:");
		double Ya = sc.nextDouble();
		double Yb = sc.nextDouble();
		double Yc = sc.nextDouble();

		double Xp = (Xa + Xb + Xc) / 2;

		double Yp = (Ya + Yb + Yc) / 2;

		double areaX = Math.sqrt(Xp * (Xp - Xa) * (Xp - Xb) * (Xp - Xc));

		double areaY = Math.sqrt(Yp * (Yp - Ya) * (Yp - Yb) * (Yp - Yc));

		System.out.println("A �rea de X � " + areaX);
		System.out.println("A �rea de Y � " + areaY);

		if (areaX > areaY) {
			System.out.println("A �rea de X � maior");
		} else {
			System.out.println("A �rea de Y � maior");
		}

		sc.close();

	}

}
