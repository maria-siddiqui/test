
public class T2 {
	public static void main(String[] args) {
		String str="13766672";
		int fin=0;
		int j=0;
		int num = 0;
		for(int i=0;i<str.length();i++){
			char x=str.charAt(i);
			num=(int)x;
			num=num-48;
				int xyz = 1;
				xyz=(int)Math.pow(10,(double)(str.length()-i-1));
				fin=fin+(num*xyz);			
		}
		System.out.println(fin);	
	}
}
