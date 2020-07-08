package ComparatorHackerRank;

import java.util.Comparator;

public class Checker2 implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		double epsilon=0.001;
		if(Math.abs(s1.getCgpa()-s2.getCgpa())>epsilon)
		{
			return (s1.getCgpa()>s2.getCgpa()) ?-1 : +1;
		}
		else if(!s1.getFname().equals(s2.getFname()))
		{
			return s1.getFname().compareTo(s2.getFname());
		}
		else
		{
			return s1.getId()-s2.getId();
		}		
		
	}

}
