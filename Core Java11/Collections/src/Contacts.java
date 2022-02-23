import java.util.TreeMap;
import java.util.*;
public class Contacts {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 985489604, "Rawal");
		contact.put((long) 789355664, "Shivamani");
		contact.put((long) 723874853, "Nusair");
		contact.put((long) 701013306, "Moshin");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}