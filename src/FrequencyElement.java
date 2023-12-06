
public class FrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = new int[] {1,2,8,3,2,2,2,5,1};
int[] fr = new int[arr.length];
int p = -1;
for(int i=0;i<arr.length;i++) {
	int count = 1;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
		count++;
		fr[j]=p;
		
		}
	}
	if(fr[i]!=p)
		fr[i]=count;
}
	
	System.out.println("element | frequency");
	for(int i=0;i<fr.length;i++) {
		if(fr[i]!=p)
			System.out.println(" "+arr[i]+" | "+fr);
	}

}}
