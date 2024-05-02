public class Motorbike
{
    private String id;
	private String name;
	private String manu;
	private int quantity;
	private double price;
	private double weight;
	private String date;
	public Motorbike(){
	    
	}
	public Motorbike(String id,String name,String manu,int quantity,double price,double weight,String date){
	    this.id = id;
	    this.name = name;
	    this.manu = manu;
	    this.quantity = quantity;
	    this.price = price;
	    this.weight = weight;
	    this.date = date;
	}
	public String getManu(){
	    return manu;
	}
	public double getWeight(){
	    return weight;
	}
	public int getQuantity(){
	    return quantity;
	}
	public printMotorbike(){
	   String s = id+" "+name+" "+manu+" "+quantity+" "+price+" "+weight+" "+date;
	    System.out.println(s);
	}
}
