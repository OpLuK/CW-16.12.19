import java.util.Scanner;
public class chisla {
	void chisla1 () {
		String chislo1; 
		String chislo2;
		String sumOut;
		String difOut;
		String divOut;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите ДЕЙСТИВТЕЛЬНУЮ часть ПЕРВОГО числа: ");
		double x1 = in.nextDouble();
		System.out.println("Введите МНИМУЮ часть ПЕРВОГО числа: ");
		double  iy1 = in.nextDouble();
		System.out.println("Введите ДЕЙСТВИТЕЛЬНУЮ часть ВТОРОГО числа: ");
		double x2 = in.nextDouble();
		System.out.println("Введите МНИМУЮ часть ВТОРОГО числа: ");
		double  iy2 = in.nextDouble();
		in.close();
		if (iy1 < 0){chislo1 = x1 + "" + iy1 + "i";}
		else {chislo1 = x1 + "+" + iy1 + "i";}
		if (iy2 < 0){chislo2 = x2 + "" + iy2 + "i";}
		else {chislo2 = x2 + "+" + iy2 + "i";}
		System.out.println("Ваше первое число: " + chislo1);
		System.out.println("Ваше второе число: " + chislo2);
		double sumx = x1 + x2;
		double sumy = iy1 + iy2;
		if (sumy < 0){sumOut = sumx + "" + sumy + "i";}
		else {sumOut = sumx + "+" + sumy + "i";}
		double difx = x1 - x2;
		double dify = iy1 - iy2;
		if (dify < 0){difOut = difx + "" + dify + "i";}
		else {difOut = difx + "+" + dify + "i";}
		double divx = x1 * (x2 + iy2);
		double divy = iy1 * (x2 + iy2);
		if (divy < 0){divOut = divx + "" + divy + "i";}
		else {divOut = divx + "+" + divy + "i";}
		System.out.println("Сумма ваших чисел равна: " + sumOut);
		System.out.println("Разность ваших чисел равна: " + difOut);
		System.out.println("Произведение ваших чисел равно: " + divOut);
	}
}
