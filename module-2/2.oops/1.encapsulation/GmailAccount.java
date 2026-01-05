public class GmailAccount {
	private String firstname;
	private String lastname;
	private long contactname;
	private String mailid;
	private String password;

	public GmailAccount( String firstname,String lastname,long contactname,String mailid,String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.contactname = contactname;
		this.mailid = mailid;
		this.password =  password;
	}

	public void setPassword(Sting password) {
		this.password = password;
	}

}