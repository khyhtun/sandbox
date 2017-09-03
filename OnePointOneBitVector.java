public class OnePointOneBitVector
{
	public static void main(String... args)
	{
		System.out.println("abcd: " + isUnique("abcd"));
		System.out.println("abcda: " + isUnique("abcda"));
		System.out.println("abcdefghijklmnopqrstuvwxyz: " + isUnique("abcdefghijklmnopqrstuvwxyz"));
		System.out.println("abcdefghijklmnopqrstuvwxyza: " + isUnique("abcdefghijklmnopqrstuvwxyza"));
	}
	public static boolean isUnique(String str)
	{
		int checker = 0;
		for(int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i) -  'a';
			if((checker & (1 << val)) > 0 )
			{
				return false;
			}
			checker |= (1 << val);
		}	
		return true;
	}	
}	
