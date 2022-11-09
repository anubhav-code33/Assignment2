
public class DuplicateAr {

	public static void main(String[] args) {
		
		int[] ar= {1,2,3,1,5,2,7,4,3};
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]==ar[j]) {
					System.out.println(ar[j]);
				}
			}
		}
	}

}
