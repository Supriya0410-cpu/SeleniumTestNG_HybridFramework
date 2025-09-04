package Array_String;

public class SplitMethod {

	public static void main(String[] args) {

		
		
	String s1= "Selenium, Postman,Cypress,Playwrite";
	
String res[]=s1.split(",");

System.out.println(res[2]);

// WAP given string retrive the total amount and check wheteher total amount i s<10000 or not  

String s2=" Total Bill Count is 70000";

String res1[]=s2.split(" ");
String amount=res1[5];
System.out.println(amount);

int res3=Integer.parseInt(amount);

System.out.println(res3);

if(res3<=10000)
{
	
	System.out.println("Amount is greature than 10000");
}

else
{
	System.out.println("Amount less then 10000");
}







// WAP Given numbers are positive or negative  

String a="10,-10,20,-20";

String re[]=a.split(",");

int re1=Integer.parseInt(re[2]);

if (re1>0)
{
	System.out.println("Positive Number");
}

else 
{
	System.out.println("Negative Number");
}



System.out.println("*********RIGHT CLICK->SOURCE->GENERATE GETTER SETTER*********************************************************************************************************");
String s11="java";
char res11=' ';
for(int i=s11.length()-1;i>=0;i--)
{
	
//res11=(char) (res11+s11.charAt(i));
	
	System.out.println( res11=s11.charAt(i));
}


	}

}
