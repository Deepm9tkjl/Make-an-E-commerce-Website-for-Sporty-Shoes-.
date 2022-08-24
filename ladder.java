

ublic class ladder {

	
	public  static ArrayList<Integer> printLeaders(int arr[])
	{ ArrayList<Integer> ans=new   ArrayList<Integer>();
	int rmax=Integer.MIN_VALUE;
	
		for (int i = arr.length-1; i >=0; i--) {
			if(arr[i]>=rmax) {
				ans.add(arr[i]);
				rmax=arr[i];
			}
			
		}
		Collections.reverse(ans);
		
		return ans;
	}

	
	public static void main(String[] args)
	{
	
		int arr[] = new int[]{16, 1, 4, 3, 5, 2};
		
	
	ArrayList<Integer> ans=printLeaders(arr);
	for(int an:ans) {
		System.out.print(an +"  ");
	
	

