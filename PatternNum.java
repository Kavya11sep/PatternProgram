import java.util.*;
class PatternNum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		for(int i=1;i<=n;i++){
			int a = n-i+1;
			for(int j=1;j<=n;j++){
				if(j>=i){
					System.out.print(a--+ " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
	}
}
