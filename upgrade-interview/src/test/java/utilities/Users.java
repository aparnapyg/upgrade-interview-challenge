package utilities;
/**
 * User credentials as enum object.
 * @author Aparna
 *
 */
public enum Users {

	  ACCTHOLDR_1("candidate+123@upgrade-challenge.com", "Apa040882");     

	  private String username;
	  private String password;

	  private Users(String username, String password) {
	    this.username = username ;
	    this.password = password ;
	  }
	  
	  public String getUserName() {
		  return this.username;
	  }
	  
	  public String getPassword() {
		  return this.password;
	  }

	  // rest of code

	}
