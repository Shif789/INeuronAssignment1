
public class Maxoccurchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "iuydydhzgh";
		s = s.replace(" ","");
		int count =0;
		int pivot =0;
		int index_position = 0;
		int k=0;
		int [] counts = new int[s.length()];
		//System.out.println(s);
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
			{
				for(int j=0;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
						count++;
				}

				counts[i] = count;
				count = 0;
			}


		
		
		

	for(k=0;k<counts.length;k++)
	{
		
		if(counts[k]>pivot)
		{
			pivot = counts[k];
			index_position = k;
		}
	}

	

	System.out.println("The highest repeated charachter in String is "+'"'+s.charAt(index_position)+'"'+ " and it has been repeated for " + pivot +" times");
	
	
}
}

	