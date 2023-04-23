package org.in.main;

public class Restaurent
{
  private String dishname;
  private int price;
  
  public Restaurent()
  {
	  
  }

public String getDishname() {
	return dishname;
}

public void setDishname(String dishname) {
	this.dishname = dishname;
}

public int getPrice()
{
	return price;
}

public void setPrice(int price)
{
	this.price = price;
}

@Override
public String toString() 
{
	return String.format("%-20s%10d", dishname,price);
}
  
}
