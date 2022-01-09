

public interface PolynomialADT
{
	public boolean insert(int x, int y);
	public void displayPoly();
	public void addPolyNomials(PolynomialDataStructure poly1, PolynomialDataStructure poly2);
	public void addPolyNodeFirst(int x, int y);
	public void addPolyNodeLast(int x, int y);
	public void addPolyNode(int x, int y, int p);
}
