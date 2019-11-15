import org.junit.Assert;
import org.junit.Test;

import com.example.org.Student;


public class TesterForStudent {

	Student obj = new Student();
	
	
	@Test
	
	public void testCountAvg()
	{
		int res = obj.countAvg(10, 20, 30);
		Assert.assertEquals(res, 20);
		
	}
	
	
@Test
	
	public void testGetGrades()
	{
		String res = obj.getGrades(95);
		Assert.assertEquals("A", res);
		
	}
	
}
