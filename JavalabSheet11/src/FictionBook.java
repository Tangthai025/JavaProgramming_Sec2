import java.time.Year;
public class FictionBook implements Author,Book{
	private String _name;
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publicYear)
	{
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) 
	{
		_name=name;
	}
	public void setEmail(String email) 
	{
		this.email= email;
	}
	public boolean checkFormatName() 
	{
		if(_name.indexOf(" ") >0) 
		{
			return true;
		}
		else {
			return false;
		}
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	public int totalPublicYear() {
		// TODO Auto-generated method stub
		return Year.now().getValue() - publicYear;
	}
	public String getLastName() {
		// TODO Auto-generated method stub
		return _name.substring(_name.indexOf(" ")+1).toUpperCase();
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return _name.substring(0,_name.indexOf(" "));
	}
	public boolean checkEmail() {
		// TODO Auto-generated method stub
		if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public String toString() 
	{
		return title+"write by "+getLastName().substring(0,1)+"."+getFirstName().toUpperCase()+"("+email+")"+
	"\nPublished for "+totalPublicYear()+" year.";
	}
}
