import java.util.ArrayList;


public class Partition {

	
	public void partition(String s){
		ArrayList<String> finalString=new ArrayList<>();
		int index = 0;
		int startIndex = 0 ;
		int commaIndex =0;
		String str= "";
		for(int i = 0;i<=s.length()-1;i++){
			
			if(!(s.substring(i,i+1).equals(","))){
				//System.out.println(s.substring(i,i+1));
				
				index++;
				//lastIndex += 1;
				
				str = str+s.substring(i,i+1);
				//finalString[i] = finalString[i]+str;
				//finalString.add(str);
				//str = str+s.substring(i,index);
				//System.out.println("str is "+str);
				continue;
				
			}
			else{
				commaIndex = i;
				//finalString.add(e)
				//startIndex = index -i;
				//finalString.add(s.substring(startIndex, index)+" ");
				
				//index = i;
				
			}
			String tmp = s.substring(commaIndex-index, commaIndex);
			System.out.println(tmp+" ");
			index = 0;
			finalString.add(tmp);
			
			
			
			/*else if(s.substring(i,i+1).equals(",")){
				//str = str + " ";
				finalString.add(str +" ");
				str = "";
			}*/
			
		}
		System.out.println("the word is "+finalString);
		
	}
}
