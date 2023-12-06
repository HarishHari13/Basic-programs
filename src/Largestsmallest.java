
public class Largestsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		
		int arr[] = {5,10,12,2,87,13};
		int largest = arr[0];
		int smallest = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i])
				smallest = arr[i];
			if(largest < arr[i])
				largest = arr[i];
			
		
				
		}
		System.out.println(smallest);
		System.out.println(largest);
		
		
		
		
		
				
				
				
		

	}

}
