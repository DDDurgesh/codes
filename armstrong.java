import java.io.*;
class armstrong 
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num,sum=0,rem,m,d;
		System.out.println("enter the num value");
		num=Integer.parseInt(br.readLine());
		d=(int)Math.log10(num)+1;
		m=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(int)Math.pow(rem,d);
			num=num/10;
		}
		if(sum==m)
		{
			System.out.println("armstrong num");
		}
		else
		{
			System.out.println("not a armstorng num");
		}
	}
}
