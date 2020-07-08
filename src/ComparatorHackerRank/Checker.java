package ComparatorHackerRank;

import java.util.Comparator;

public class Checker implements Comparator<Player>{
	
	@Override
	public int compare(Player a, Player b) {
		
		if(a.score<b.score) {
			return 1;	
		}
		else if(a.score>b.score)
		{
			return -1;
		}
		else if(a.score==b.score && a.name.compareToIgnoreCase(b.name)>0)
		{
			return 1;
		}
		else if(a.score==b.score && a.name.compareToIgnoreCase(b.name)<0)
		{
			return -1;
		}
		else
		{
			return -1;
		}
		
	    
    }

}
