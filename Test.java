import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	static HashMap<Character,Integer> hashMap=new HashMap<>();
	
	public static void histogram(int adet) {
		if(adet!=0) {
			for(int i=0;i<adet;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		else {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		String alfabe="abcdefghijklmnoprstuvyz";
		String str="ben bir garip stringim"
				+ " birden fazla kelimem var"
				+ " tabii bir sürü de harfim var";
		String[] strDizi=str.split(" ");
		
		for (String string : strDizi) {
			for(int i=0;i<string.length();i++) {
				if(!hashMap.containsKey(string.charAt(i))) {
					hashMap.put(string.charAt(i),1);
				}
				else {
					hashMap.replace(string.charAt(i), hashMap.get(string.charAt(i))+1);
				}
			}
		}
		
	    //System.out.println(hashMap);
	    
	    for(int j=0;j<alfabe.length();j++) {
	    	if(hashMap.containsKey(alfabe.charAt(j))) {
	    		System.out.print(alfabe.charAt(j)+"\t");
	    		histogram(hashMap.get(alfabe.charAt(j)));
	    	}
	    	else {
	    		System.out.print(alfabe.charAt(j));
	    		histogram(0);
	    	}
	    }
	      
	}

}