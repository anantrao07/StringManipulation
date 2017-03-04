import java.util.ArrayList;
import java.util.HashMap;

//class to seperate the given String using  String Class ' Split() function 
//and printing the number of times the word has been repeated in the given string.

public class Processing {

	
	public void processor(String str ){
	
		String[] sarray = str.split("\\,");
		HashMap<String, Integer> countHash = new HashMap<String, Integer>();
		
		
		for(int i = 0 ;i< sarray.length;i++){
			String s = sarray[i];
		
			 if(countHash.containsKey(s)){
				 countHash.put(s, countHash.get(s)+1);
				 System.out.println(countHash.get(s));
					
			}
			
			 else if(countHash.containsKey(s) == false){
				 countHash.put(s, 1);
		}
	
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Input inp = new Input();
		Partition part = new Partition();
		part.partition(inp.getSentence());
		Processing ps = new Processing();
		ps.processor(inp.getSentence());
		
		
	}

}
