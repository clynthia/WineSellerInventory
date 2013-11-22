
public class Sale {

	public String saleID;
	public String loginID;
	public double sumTotal;
	public String date;
		
	
	public Sale(String saleID, String userID, double sumTotal, String date) {
		this.saleID = saleID;
		this.loginID = userID;
		this.sumTotal = sumTotal;
		this.date = date;
	}

	public String getSaleID() {
		return saleID;
	}
	
	public void setSaleID(String saleID) {
		this.saleID = saleID;
	}
	
	public String getUserID() {
		return loginID;
	}
	
	public void setUserID(String userID) {
		this.loginID = userID;
	}
	
	public double getSumTotal() {
		return sumTotal;
	}
	
	public void setSumTotal(double sumTotal) {
		this.sumTotal = sumTotal;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	

}
