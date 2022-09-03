public class StringSearch {

	String para;
	StringSearch(String s)
	{
		para=s;
	}
	int CountWords()
	{
		 String words[]=para.split("\\s");  
		 return words.length;
	}

    int CountChars()
    {
    	return para.length();
    }
    int SearchWord(String w)
    {
    	String words[]=para.split("\\s"); 
    	int c=0;
    	for(int j=0;j<words.length;j++)
    		if(w.matches(words[j]))
    			c++;
    	return c;
    }
    
}