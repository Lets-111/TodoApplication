package webapp;

public class UserValidationService {
	
	public boolean isUserValid(String userName, String password)
	{
		if(userName.equals("dipanshu") && password.equals("pass"))
         {
	        return true;
         }
         return false;
	}

}
