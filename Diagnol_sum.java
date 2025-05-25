public class Diagnol_sum {
	public static void main(String[] args){
		int[][] a ={ 
		        {1,2,3},
		        {5,6,7},
		        {9,4,8} 
			};
			int right = a[0][0]+ a[1][1]+ a[2][2];  // Ye right diagnol ki indexing
			int left =  a[0][2]+ a[2][0];           //Ye left side ki indexing
			System.out.println(right+left);           //Dono ko concatinate kara diya
			System.out.println(a[0][0]+ a[1][1]+ a[2][2]+a[0][2]+ a[2][0]);     // Ye direct indexing ko concatinate kara diya. isse line of code kaam hoga
		}
	}