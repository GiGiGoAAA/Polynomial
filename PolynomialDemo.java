
import java.io.DataInputStream;
import java.io.IOException;

public class PolynomialDemo
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{

		DataInputStream inp = new DataInputStream(System.in);
		int i, coef, exp;

		PolynomialDataStructure sum1 = new PolynomialDataStructure();
		PolynomialDataStructure sum2 = new PolynomialDataStructure();
		PolynomialDataStructure p1 = new PolynomialDataStructure();
		PolynomialDataStructure p2 = new PolynomialDataStructure();
		PolynomialDataStructure p3 = new PolynomialDataStructure();
		PolynomialDataStructure p4 = new PolynomialDataStructure();
		System.out.println("Enter the num: of terms of 1st polynomial");
		i = Integer.parseInt(inp.readLine());

		while (i != 0)
		{
			System.out.println("Enter the coefficent ");
			coef = Integer.parseInt(inp.readLine());
			System.out.println("Enter the exponent");
			exp = Integer.parseInt(inp.readLine());
			if (p1.insert(coef, exp))
				i--;
		}
		System.out.println("Enter the num: of terms of 2nd polynomial");
		i = Integer.parseInt(inp.readLine());
		while (i != 0)
		{
			System.out.println("Enter the coefficent ");
			coef = Integer.parseInt(inp.readLine());
			System.out.println("Enter the exponent");
			exp = Integer.parseInt(inp.readLine());
			if (p2.insert(coef, exp))
				i--;
		}
		System.out.println("Enter the num: of terms of 3rd polynomial");
		i = Integer.parseInt(inp.readLine());
		while (i != 0)
		{
			System.out.println("Enter the coefficent ");
			coef = Integer.parseInt(inp.readLine());
			System.out.println("Enter the exponent");
			exp = Integer.parseInt(inp.readLine());
			if (p3.insert(coef, exp))
				i--;
		}
		System.out.println("Enter the num: of terms of 4th polynomial");
		i = Integer.parseInt(inp.readLine());
		while (i != 0)
		{
			System.out.println("Enter the coefficent ");
			coef = Integer.parseInt(inp.readLine());
			System.out.println("Enter the exponent");
			exp = Integer.parseInt(inp.readLine());
			if (p4.insert(coef, exp))
				i--;
		}

		System.out.print("1st Polynomial:  ");
		p1.displayPoly();
		System.out.print("2nd Polynomial:  ");
		p2.displayPoly();
		System.out.print("3rd Polynomial:  ");
		p3.displayPoly();
        System.out.print("4th Polynomial:  ");
        p4.displayPoly();

		sum1.addPolyNomials(p1, p2);
		System.out.print("Added Polynomial sum1:  ");
		sum1.displayPoly();
		sum2.addPolyNomials(p3, p4);
		System.out.print("Added Polynomial sum2:  ");
		sum2.displayPoly();
	}
}
