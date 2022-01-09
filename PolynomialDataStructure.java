//Chaorui Xiang
//CSC236-02
//Lab3#PolynomialDataStructure
public class PolynomialDataStructure implements PolynomialADT
{
	public PolyNode firstNode;
	public PolynomialDataStructure()
	{
		firstNode = null;
	}
	public PolynomialDataStructure(PolyNode firstNode)
	{
		this.firstNode = firstNode;
	}
	public PolynomialDataStructure(PolynomialDataStructure pds)
	{
		this.firstNode = pds.firstNode;
	}

	public boolean isEmpty()//
	{
		return (firstNode == null);
	}

	public void setFirstNode(PolyNode firstNode)//
	{
		firstNode = firstNode;
	}
	public PolyNode getFirstNode()
	{
		return this.firstNode;
	}

	public void addPolyNodeFirst(int x, int y)//
	{
		PolyNode newNode = new PolyNode(x, y);
		firstNode = newNode;
	}
	public void addPolyNodeLast(int x, int y)//
	{
		PolyNode newNode = new PolyNode(x, y);
		newNode.next = null;
		if (isEmpty())
			firstNode = newNode;
		else
		{
			PolyNode current = firstNode;
			while (current.next != null)
			current = current.next;
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	public void addPolyNode(int x, int y, int p)//
	{
		PolyNode current = firstNode;
		PolyNode newNode = new PolyNode(x, y);
		for (int i = p; i > 1; i--)
		    current = current.next;
			newNode.next = current.next;
			current.next = newNode;
	}
	public void addPolyNomials(PolynomialDataStructure poly1, PolynomialDataStructure poly2)
	{
		int x, y;
		PolyNode current1 = poly1.firstNode;
		PolyNode current2 = poly2.firstNode;
		while (current1 != null && current2 != null)
		{
			if (current1.getExponent() == current2.getExponent())
			{
				x = current1.getCoefficient() + current2.getCoefficient();
				y = current1.getExponent();
				current1 = current1.next;
				current2 = current2.next;
			}
			else if (current1.getExponent() > current2.getExponent())
			{
				x = current1.getCoefficient();
				y = current1.getExponent();
				current1 = current1.next;
			}
			else
			{
				x = current2.getCoefficient();
				y = current2.getExponent();
				current2 = current2.next;
			}
			addPolyNodeLast(x, y);
		}
		while (current1 != null)
		{
			x = current1.getCoefficient();
			y = current1.getExponent();
			current1 = current1.next;
			addPolyNodeLast(x, y);
		}
		while (current2 != null)
		{
			x = current2.getCoefficient();
			y = current2.getExponent();
			current2 = current2.next;
			addPolyNodeLast(x, y);
		}

	}
	public boolean insert(int x, int y)
	{
		PolyNode current = firstNode;
		int pos = 0;
		while (current != null)
		{
			if (current.getExponent() == y)
			{
				System.out.println("Not a valid term. Insert again");
				return false;
			} else if (current.getExponent() < y)
				break;
			pos++;
			current = current.next;
		}
		if (pos == 0)
			addPolyNodeFirst(x, y);
		else
			addPolyNode(x, y, pos);
		return true;
	}
	public void displayPoly()
	{
		int j = 0;
		PolyNode current = firstNode;
		while (current != null)
		{
			if (j != 0 && current.getCoefficient() > 0 && current.getCoefficient() != -1)
				System.out.print(" + ");
			if (current.getCoefficient() != 0)
			{
				if (current.getCoefficient() > 1 || current.getCoefficient() < -1 || current.getExponent() == 0)
					System.out.print(current.getCoefficient());
				else if (current.getCoefficient() == -1)
					System.out.print(" - ");
				if (current.getExponent() == 1)
					System.out.print("x");
				else if (current.getExponent() > 1 || current.getExponent() < 0)
					System.out.print("x^" + current.getExponent());
				j = 1;
			}
			current = current.next;
		}
		System.out.println(" ");
	}
	public String toString()
	{
		return "PolynomialDataStructure [FirstNode=" + firstNode + "]";
	}

}
