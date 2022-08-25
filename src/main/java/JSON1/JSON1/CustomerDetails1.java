package JSON1.JSON1;

public class CustomerDetails1 {
private	String bookName;
private	String purchaseDate;
private	int amount;
private	String location;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String toString() {
		return "CustomerDetails [ bookname ="+bookName+", purchaseDate ="+purchaseDate+",location = "+location+",amount = "+amount+"]";
	}
	
	
	}
	
	
	




