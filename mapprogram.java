package simpleprograms;

import java.util.HashMap;
import java.util.Map;

public class mapprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer>student=new HashMap<String, Integer>();
		student.put("manoj", 98);
		student.put("harsh", 90);
		student.put("vikas", 98);
		student.put("raj", 90);
		student.put("rani", 98);
		student.put("dev", 90);
		
		System.out.println(student);
		
		for(String key:student.keySet())
		{
			System.out.println(key+" : "+student.get(key));
		}
	}

}
