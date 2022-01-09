//Chaorui Xiang
//CSC236-02
//Lab3#PolyNode
public class PolyNode
{
	private int coefficient;
	private int exponent;
	public PolyNode next;
	public PolyNode()
	{
        coefficient = 0;
        exponent = 0;
	}
	public PolyNode(int coefficient, int exponent)
	{
		this.coefficient = coefficient;
		this.exponent = exponent;
		this.next = null;
	}
	public PolyNode(PolyNode polyNode)
	{
		this.coefficient = polyNode.coefficient;
		this.exponent = polyNode.exponent;
		this.next = new PolyNode(polyNode.next);
	}
	public void setCoefficient(int coefficient)
	{
		this.coefficient = coefficient;
	}
	public void setExponent(int exponent)
	{
		this.exponent = exponent;
	}
	public void setNext(PolyNode next)
	{
		this.next = next;
	}
	public int getCoefficient()
	{
		return coefficient;
	}
	public int getExponent()
	{
		return exponent;
	}
	public PolyNode getNext()
	{
		return next;
	}
}