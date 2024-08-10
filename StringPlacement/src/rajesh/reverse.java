package rajesh;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stubsyso
		
	//	s=s.toLowerCase();
		System.out.println(rev("water is water"));
	}

	private static int rev(String s) {
		// TODO Auto-generated method stubfor(
		String temo="";
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			temo+=c;
			
		}
		if(s.equals(temo)) {
			return 1;
		}
		
		else {
			return 0;
		}
	}

}
