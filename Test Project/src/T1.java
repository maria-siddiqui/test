import java.util.ArrayList;
import java.util.Random;

public class T1 {

	public static void main(String[] args) {
		char Array[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
		int intArray[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
		
		Random rand = new Random();
		int i,j,intNum=0;
		ArrayList<Integer> intArrray = new ArrayList<Integer>();
		while(intNum<2){
			intNum = rand.nextInt(10);
		}
		
		//System.out.println(intNum);
		for(i=0;i<intNum;i++){
			
			int flag=1;
			int x=0;
			while(flag==1){
				flag=0;
				x=rand.nextInt(10);
				//System.out.println(intArrray.size());
				for(j=0;j<intArrray.size();j++){
					if(x==intArrray.get(j)){
						flag=1;
						break;
					}
					
				}
			}
			intArrray.add(x);
		}
		
		for(i=0;i<10;i++){
			int flag1=0;
			for(j=0;j<intArrray.size();j++){
				if(intArrray.get(j)==i){
					flag1=1;
				}
			}
			if(flag1==0){
				int randNum=rand.nextInt(25);
				while(intArray[randNum]==0){
					randNum=rand.nextInt(25);
				}
				intArray[randNum]=0;
				System.out.print(Array[randNum]);
			}
			else{
				int randNum=rand.nextInt(10);
				while(intArray[randNum+25]==0){
					randNum=rand.nextInt(10);
				}
				intArray[randNum+25]=0;
				System.out.print(Array[randNum+25]);
			}
			
		}
	}

}
