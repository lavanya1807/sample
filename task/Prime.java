class Prime{
public static void main(String[] agrs){
int count=0, num=37;
if(num==0 || num==1)
{
	System.out.println(num +"is not a prime number");
}
else{
	for(int i=1;i<=num/2;i++){
	if(num%i==0){
	    count++;
	}
	}
	if(count>1){
	   System.out.println(num +"is not a prime number");
	}
	else{
	   System.out.println(num +"is a prime number");
	}
    }
}
}