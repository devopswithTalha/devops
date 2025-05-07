package Stringexample;

class stringPalindrome {
	public static void main(String[] args) {
		String s ="MADAM";// Original String

		char[] ch = s.toCharArray(); //Convert String into array

		String rev =""; //Reverse String

		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}

		System.out.println("Original string : "+s);
		System.out.println("Reverse String :"+ rev);

		if(s.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Non Palindrome");
		}
}
}