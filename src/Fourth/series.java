package Fourth;

import java.io.Serializable;

public class series implements Serializable {
	private int ID;
	private String name;
	private String attribute;
	private float price;
	
	public series() {}
	public series(int iD, String name, String attribute, float price) {
		super();
		ID = iD;
		this.name = name;
		this.attribute = attribute;
		this.price = price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "产品ID："+ID+"\n产品名称："+name+"\n产品属性："+attribute+"\n产品价格："+price+"元\n";
	}
}
