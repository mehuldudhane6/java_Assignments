import java.util.*;
class RevNo{
    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
			System.out.println("ennter the no.");
		    int num=sc.nextInt();
			int temp=num;
			int rev=0;
			while(num!=0)
			{
			  int x=num%10;
			   rev=rev*10+x;
			   num=num/10;
			}
			System.out.println(rev);
			
}
}