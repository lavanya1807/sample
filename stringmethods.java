
class Stringmethods{
public static void main(String[] args){
String s1="Welcome";
String s2=" to the";
String s3=" Candid";
String s4="    Candid     ";
var c1=s1.charAt(3); //Charat
var c2=s1.concat(s2).concat(s3); // Concatenate
System.out.println(c1); // print Charat
System.out.println(c2); //print Concatenate
System.out.println(c2.startsWith("Welcome"));// Startwith
System.out.println(c2.endsWith("Candi"));  // EndWith
System.out.println(s3.equals(s4)); // equals(true)
System.out.println(s1.equals(s3)); // equals(false)
System.out.println(c2.indexOf("to")); // indexOf
System.out.println(c2.indexOf("Candid",7)); // indexOf another method
System.out.println(c2.lastIndexOf("e", 5)); // lastindexOf
System.out.println(c2.length()); //length
System.out.println(c2.replace("C","c")); //replace
System.out.println(c2.replaceAll("t","T")); //replace
System.out.println(c2.toUpperCase()); //uppercase
System.out.println(c2.toLowerCase()); //lowecase
System.out.println(s4.trim()); //trim
System.out.println(c2.substring(3,7)); //substring
String[] result=c2.split("\n");
{
for (String str : result)
{
System.out.println(str);
}
} // split
}
}