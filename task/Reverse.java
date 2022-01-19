class Reverse
{
public static void main(String[] args)
{
int num=136;
int Newnum=0,rem;
while(num>0)
{
rem=num%10;
Newnum=(Newnum*10)+rem;
num=num/10;
}
System.out.println(Newnum);
}
}
