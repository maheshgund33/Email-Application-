//Project1 => Email Application
//
//Scenario: You are an IT Support Administrator Specialist and are charged with the task of creating email accounts for new hires.
//
//Your application should do the following:
//
//1.Generate an email with the following syntax: firstname.lastname@department.company.com
//2.Determine the department (sales, development, accounting), if none leave blank
//3.Generate a random String for a password
//4.Have set methods to change the password, set the mailbox capacity, and define an alternate email address
//5.Have get methods to display the name, email, and mailbox capacity
//6. Update the details  in git repo as well.

package EmailApplication;

public class Email {
	public static void main(String[] args) {
		EmailApp emp= new EmailApp("Mahesh","Gund");
		EmailApp emp= new EmailApp("Vaishnavi","Gund");
		
		emp.setAlternateEmail("MG@gmail.com");
		System.out.println("Alternate Email is: "+ emp.getAlternateEmail());
		
		System.out.println(emp.Info());
		
	}
	
	

}
