import java.util.Date;

public class OnePointOne
{
	public boolean isAllUniqueCharacters(String str)
	{
		boolean flag = true;
		for(int i = 0; i < str.length(); i++)
		{
        		for(int j = 0; j < str.length(); j++)
			{
				if(i == j)
					continue;
				if(str.charAt(i) == str.charAt(j))
				{	
					System.out.println(str.charAt(i) + " " + str.charAt(j));
					return false;
				}
			}
		}
		return flag;
	}
	public static void main(String... args)
	{
		System.out.println(new Date());
		String str1 = "hello";
		boolean flag1 =	new OnePointOne().isAllUniqueCharacters(str1);
		System.out.println(str1);
		System.out.println(flag1);

		System.out.println(new Date());
		String str2 = "whoa";
		boolean flag2 = new OnePointOne().isAllUniqueCharacters(str2);
		System.out.println(new Date());
		System.out.println(str2);
		System.out.println(flag2);
		String str3 = "A quick brown fox jumps over the lazy dog.";
		boolean flag3 = new OnePointOne().isAllUniqueCharacters(str3);
		System.out.println(new Date());
		System.out.println(str3);
		System.out.println(flag3);
		String str4 = "abcdefghijklmnopqrstuvwxyz .1234567890~!@#$%^&*()_+-=/?'\"[]{}\\|";
		boolean flag4 = new OnePointOne().isAllUniqueCharacters(str4);
		System.out.println(new Date());
		System.out.println(str4);
		System.out.println(flag4);
	}
}
