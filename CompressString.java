package Program;

public class CompressString {
	public static void main(String[] args) {
		System.out.println(compress("aaabbbcccaabbcc"));
	
		
	}
		public static String compress(String s) {
			String result="";
			int count=0;
			int start=0;
			int end=0;
			while(end!=s.length()) {
				
				if(s.charAt(start)==s.charAt(end)) {
					count++;
					end++;
				}
				else {
					result=result+""+s.charAt(start)+""+count;
					count=0;
					start=end;
					}
				if(end==s.length()) {
					result=result+""+s.charAt(start)+""+count;
					}
			}
			return result;
		}
	}
