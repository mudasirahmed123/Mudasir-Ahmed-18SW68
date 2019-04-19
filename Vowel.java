class Vowel{
public static void main(String[] args){
char ch='a';
switch(ch){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println("Vowel is:"+ ch);
break;
default:
System.out.println("Consonant is:"+ ch);
}
}
}