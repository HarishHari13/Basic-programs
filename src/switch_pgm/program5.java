package switch_pgm;
import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		int stud_id,mark1,mark2,mark3;
		String stud_name;
	    float total,avg;
	    Scanner s = new Scanner(System.in);
	    		System.out.print("enter the stud id:");
	    		stud_id = s.nextInt();
	    		System.out.print("enter the stud name:");
	    		stud_name = s.next();
	    		System.out.print("enter the mark1:");
	    		mark1 = s.nextInt();
	    		System.out.print("enter the mark2:");
	    		mark2 = s.nextInt();
	    		System.out.print("enter the mark3:");
	    		mark3 = s.nextInt();
	    		total = mark1+mark2+mark3;
	    		avg = total/3;
	    		if(avg>=90)
	    			System.out.println("excellent");
	    		else if(avg>=80)
	    			System.out.println("very good");
	    		else if(avg>=70)
	    		System.out.println("good");
	    		else if(avg>=60)
	    			System.out.println("improve");
	    		else if(avg>=50)
	    			System.out.println("work hard");
	    		else if(avg>=40)
	    			System.out.println("poor");
	    		
	    					
	    					
	    			
	    			
	 
	    
	    		;
		// TODO Auto-generated method stub

	}

}
