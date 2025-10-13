package Com.restapibasicsPOJOclass;

public class bookingpojo {

/*	
	 {
		    "firstname" : "Jim",
		    "lastname" : "Brown",
		    "totalprice" : 111,
		    "depositpaid" : true,
		    "bookingdates" : {  -----------------Nested create another class 
		        "checkin" : "2018-01-01",
		        "checkout" : "2019-01-01"
		    },
		    "additionalneeds" : "Breakfast"
		}
	
		*/


private String firstname;
private String lastname;
private int totalprice;
private boolean depositpaid;
private Bookingdatespojo bookingdates;  // Nested class obj
private String additionalneeds;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getTotalprice() {
	return totalprice;
}
public void setTotalprice(int totalprice) {
	this.totalprice = totalprice;
}
public boolean isDepositpaid() {
	return depositpaid;
}
public void setDepositpaid(boolean depositpaid) {
	this.depositpaid = depositpaid;
}
public Bookingdatespojo getBookingdates() {
	return bookingdates;
}
public void setBookingdates(Bookingdatespojo bookingdates) {
	this.bookingdates = bookingdates;
}
public String getAdditionalneeds() {
	return additionalneeds;
}
public void setAdditionalneeds(String additionalneeds) {
	this.additionalneeds = additionalneeds;
}
























}



















