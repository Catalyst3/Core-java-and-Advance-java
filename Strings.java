package String;
public class Strings
{
	public static void main(String args[])
	{
		String test = "abcdeabcdeabcde";
		String tree = "I am a Tree";
		String twoTree = "I am a tree of tree";
		String name = "Aditya";
		String lowerCaseName = "aditya";
		String fullName = "  Aditya Sawant   ";
		System.out.println(name.length());
		System.out.println(name.isEmpty());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(fullName.trim());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('A'));
		System.out.println(name.indexOf('a'));
		System.out.println(test.lastIndexOf('a'));
		System.out.println(name.equalsIgnoreCase(lowerCaseName));
		System.out.println(tree.replace("Tree", "Man"));
		System.out.println(twoTree.replace("tree", "man"));
		System.out.println(twoTree.replaceFirst("tree","man"));
		System.out.println(tree.substring(7,11));
		char[] aditya = name.toCharArray();
		System.out.println(aditya);
		System.out.println(tree.contains("am"));
		//Split
		String tree1[] = tree.split(" ");
		int x = tree1.length;
		for (int i = 0; i < x; i++)
		{
		    System.out.print(tree1[i]+" ");
		}
		System.out.println("");
		//valueOf()
		int a =10;
		String b =String.valueOf(a);
		System.out.println(b);
	}
}