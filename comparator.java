package mine;
import java.util.*;
public class comparator {
	public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        accountcomparator[] a = new accountcomparator[5];
        a[0]=new accountcomparator("nikilesh",123);
        a[1]=new accountcomparator("suuthan",1222);
        a[2]=new accountcomparator("booopalan",12221);
        a[3]=new accountcomparator("kali",123645);
        a[4]=new accountcomparator("naresh",123534);
        System.out.println("enter 1-name,2-id,3-amount,4-string length");
        int n;
        do
        {
         n= in.nextInt();
        if(n==1)
        Arrays.sort(a, new sortname());
        if(n==2)
        Arrays.sort(a, new idsort());
        if(n==3)
        Arrays.sort(a, new amountsort());
        if(n==4)
        Arrays.sort(a);
        for(accountcomparator b : a)
        {
            System.out.println(b);
        }
    }
    while(n!=0);
    }
}
class accountcomparator implements Comparable
{
    String name;
    double amount;
    int id;
    static int count = 1000;
    public accountcomparator(String s,double a)
    {
        name=s;
        amount=a;
        id=count++;
    }
    @Override
    public String toString()
    {
        return name+"\t"+amount+"\t"+id;
    }
    @Override
    public int compareTo(Object a)
    {
        accountcomparator b1 =(accountcomparator)a;
        String s1 = this.name;
        String s2 = b1.name;
        return s1.length() - s2.length();
    }
}
class sortname implements Comparator
{
    @Override
    public int compare(Object a1,Object a2)
    {
      accountcomparator b1 = (accountcomparator)a1;
      accountcomparator b2 = (accountcomparator)a2;
      return b1.name.compareTo(b2.name);  
    } 
}
class amountsort implements Comparator
{
    @Override
   public int compare(Object a1 , Object a2)
   {
       accountcomparator b1 =(accountcomparator)a1;
       accountcomparator b2 =(accountcomparator)a2;
       if(b1.amount > b2.amount) return 1;
       if(b1.amount < b2.amount) return -1;
       return 0;
   }
}
class idsort implements Comparator
{
   @Override
   public int compare(Object a1,Object a2)
   {
       accountcomparator b1 = (accountcomparator)a1;
       accountcomparator b2 = (accountcomparator)a2;
       return b1.id - b2.id;
   }
}