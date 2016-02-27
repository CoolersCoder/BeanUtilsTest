import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

public class test1 {

	@Test
	public void ss() throws IllegalAccessException, InvocationTargetException{
		user us = new user();
		 
		BeanUtils.copyProperty(us, "name", "jakc");
		
		System.out.println(us.getName());
	}
}
