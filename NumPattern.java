class NumPattern 
{
	public static void main(String[] args) 
	{
		int n = 4;
		for(int i=1;i<=n;i++){
			int a = i;
			for(int j=1;j<=n;j++){
				if(i>=j){
					System.out.print(a+ " ");
					a=a+n-j;
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
	}
}
