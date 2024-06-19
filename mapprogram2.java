package simpleprograms;

import java.util.HashMap;
import java.util.Map;

public class mapprogram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>student=new HashMap<Integer,String>();
		student.put(1, "manoj");
		student.put(2, "raj");
		student.put(3, "ravi");
		student.put(4, "anoj");
		student.put(5, "janam");
		student.put(6, "yogesh");
		
		System.out.println(student);
		
		for(int key:student.keySet())
		{
			System.out.println(key+" : " +student.get(key));
		}
		
	}

}
