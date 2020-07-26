import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;    
     
public class Count { 
	static void countEachWords(String filename,Map<String,Integer> words) throws FileNotFoundException
	{
		Scanner file=new Scanner(new File(filename));
		while(file.hasNext()) {
			String word=file.next();
			Integer count=words.get(word);
			if(count!=null)
				count++;
			else
				count=1;
			words.put(word, count);
		}
		file.close();
	}
        
    public static void main(String[] args) throws FileNotFoundException{    
    	Map<String,Integer> words=new HashMap<String,Integer>();
        countEachWords("E:\\\\notes sem 5\\\\Hadoop\\\\data.txt", words);
        Set set2 = words.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print(mentry2.getKey() + "  ");
            System.out.println(mentry2.getValue()+" times");
         }
       
        
        
    }
    }
