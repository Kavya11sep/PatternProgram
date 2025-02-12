class NumPattern2 
{
	public static void main(String[] args) 
	{
		int n = 5;
		char ch = 'A';
		for(int r=1;r<=n;r++){
			for(int c=1;c<=n;c++){
				if(r==c){
					System.out.print(ch++ + " ");
				}else{
					System.out.print(r+c + " ");
				}
			}
			System.out.println();
		}
	}
}
