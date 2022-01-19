class Palindrome
{
public static void main(String[] args)
{
int num=136;
int temp,Newnum=0,rem;
temp=num;
while(temp>0)
{
rem=temp%10;
Newnum=(Newnum*10)+rem;
temp=temp/10;
}
if(num==Newnum)
{
System.out.print(num+"it is palindrome");
}
else{
System.out.print(num+"it is not palindrme");
}
}
}

