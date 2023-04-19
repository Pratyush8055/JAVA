package pratyush;

public class caculation {

int n1,n2,res=0;
caculation(int n1, int n2) {


	this.n1=n1;
	this.n2=n2;
}
public void addition()
{
	res=0;
	res=n1+n2;
	System.out.println("sum is" +res);
	}
public void subtraction()
{
	int res=0;
		res=n1-n2;
		
	System.out.println("subtraction is"+res);

}
}
public class mycalculation extends caculation{
 
mycalculation(int n1, int n2)
{
	super(n1,n2);
}
public void mul()
{
	res=n1*n2;
	System.out.println("multiplication is"+res);
}
public static void main(String[] agrs)
{
	mycalculation obj=new mycalculation(10,20);
	obj.mul();
	obj.addition();
	obj.subtraction();
}
}

