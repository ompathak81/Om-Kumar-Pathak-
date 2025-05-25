public class Count_number {
	public static void main(String[] args){
	int[] arr={1,2,2,2,2};
	int num=2;
	int count=0;
	
	for(int i=0; i < arr.length; i++){
		if(arr[i]==num){
			count++;
		}
	}
	System.out.println(num +  " number" +count + " baar aya hai");
	}
}