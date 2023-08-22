import java.io.*;
import java.util.*;

class Age extends Exception
{
String msg;
Age(String msg)
{
super(msg);
this.msg=msg;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
try
{
System.out.println("Enter Ur Age:-");
int no=sc.nextInt();

if(no<18)
{
throw new Age("Ur Age is Less Than 18 That's Why ur not Eligible For Voting");
}
else
{
System.out.print("Ur Eligible For Voting");
}
}
catch(Age e)
{
System.out.println("Ur Age is Less Than 18 That's Why ur not Eligible For Voting");
}

}
}

