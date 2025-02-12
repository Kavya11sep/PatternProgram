class InvertedRightAngleAlphabetTriangle 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for(int i=1;i<=n;i++){
			char ch = (char)(64+n);
			for(int j=1;j<=n;j++){
				if(i+j<=n+1){
					System.out.print(ch-- + " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
	}
}
