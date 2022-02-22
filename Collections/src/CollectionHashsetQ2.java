import java.util.HashSet;

public class CollectionHashsetQ2 {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Nusair Basha");
		hs.add("Moshin");
		hs.add("Shivamani");
		hs.add("Hassan");
		hs.add("Rawal");
		
		System.out.println("Original");
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add("Hajira");
		hs.add("Sindhu");
		
		System.out.println("After adding duplicate elements");
		System.out.println(hs);
		System.out.println(hs.size());
	}

}