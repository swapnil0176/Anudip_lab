package thursdaylab4;
abstract class CarWashing 
{
	  private int price;
	  public String bill="";
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	abstract void carWash();
}
