package exercise;


public class ex6_06 {
	
	public static int [] shuffle (int[] arr){
		if(arr==null || arr.length==0)
			return arr;
		
		for(int i=1;i<arr.length;i++) {
			int j = (int)(Math.random()*arr.length);
		
			//arr[i]와 arr[j]의 값을 서로 바꾼다.
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = { 1,2,3,4,5,6,7,8,9 }; //9
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
