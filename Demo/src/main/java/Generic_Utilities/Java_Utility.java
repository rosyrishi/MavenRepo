package Generic_Utilities;

import java.util.Random;

public class Java_Utility {
	
	/**
	 * This methid is used to avoid duplicate values
	 * @author Rojalin
	 * @return
	 */
	public int getRandomNum()
	{
		Random ran=new Random();
		int value = ran.nextInt();
		return value;
	}

}
