import java.util.ArrayList;

//Class defined to  seperate given string withut using String callss' split() method

public class Partition {

	
	public void partition(String s){
		ArrayList<String> finalString=new ArrayList<>();
		int index = 0;
		int startIndex = 0 ;
		int commaIndex =0;
		String str= "";
		
		for(int i = 0;i<=s.length()-1;i++){
	
			if(!(s.substring(i,i+1).equals(","))){
				index++;
				str = str+s.substring(i,i+1);
				continue;
				
			}
			
			else{
				
				commaIndex = i;
			}
			
			String tmp = s.substring(commaIndex-index, commaIndex);
			System.out.println(tmp+" ");
			index = 0;
			finalString.add(tmp);
		}
		
		System.out.println("the word is "+finalString);
	}
}
