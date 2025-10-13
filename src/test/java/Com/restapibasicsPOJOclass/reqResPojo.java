package Com.restapibasicsPOJOclass;

public class reqResPojo {

	
	//Enapsulation principle private data and public member function 
	//understand payload then create pojo cass
	//if nested object then create seperate pojo class 
	
	
	/*
	 * {
    "name": "morpheus",
    "job": "leader"
	  }
	 */
	
	//Private data 
	private String name;
	
	private String job;
	
	//Public Member Function 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

}
