

import org.junit.Assert;
import org.junit.Test;

import com.example.org.Employee;

public class EmpTestCase {

	Employee obj = new Employee();
	
	@Test
	
	public void testgetSalary() {
		
		int sal = obj.getSalary(10, 700);
		Assert.assertEquals(sal, 7000);
	}
	
	
}
