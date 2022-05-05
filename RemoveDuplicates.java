package week3day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String a[]=text.split(" ");
		int l=a.length;
		String val="";
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				
				if(a[i].equals(a[j]))
				{
					a[j]="";
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			//System.out.println(a[k]);
			String b=a[k];
			if(b!="")
			{
				val=val+b+" ";
			}
		}
		System.out.println(val);
		
		
}
}
