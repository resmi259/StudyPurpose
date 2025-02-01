import java.util.HashMap;
import java.util.Map;

public class CollectionStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Map<String,Integer> student = new HashMap<>();
		
		
		student.put("ABC", 99);
		
		student.put("ABC1", 100);
		student.put("ABC2", 150);
		student.put("ABC4", 80);
		student.put("ABC5", 100);
		student.put("ABC6", 101);
		System.out.println(student.keySet());
		for (String key:student.keySet() )
			
		{
			System.out.println(key + ":" + student.get(key) );
		}
		
		

	}

}
