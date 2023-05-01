1) Write a Java program using try and catch to generate Array Index Out  of Bound Exception and Arithmetic Exception.
import java.util.Scanner;
public class Question1 {
public static void main(String[] args) {
System.out.println("Tapas Chatterjee Roll:19");
Scanner scan = new Scanner(System.in);
System.out.print("Enter The Length of Array:\t");
int n = scan.nextInt();
int[] arr = new int[n];
for (int i = 0; i <= n; i++) {
System.out.println("Variable " + (i+1) + " is:\t");
try {
arr[i] = scan.nextInt();
arr[i] = arr[i] / (n-i-1);
}
catch (ArrayIndexOutOfBoundsException e){
System.out.println("Array Index is Out of Bound.");
}
catch (ArithmeticException e){
System.out.println("This is an Arithmetic Exception.");
}
}
}
}


2)Write a class that keeps a running total of all characters passed to it  (one at a time) and throws an exception if it is passed a non alphabetic character. 

public class Ques2{
public static void main(String[] args) {
System.out.println("Tapas Chatterjee Roll :19");
Ques2 obj=new Ques2();
Scanner scan = new Scanner(System.in);
System.out.println("How Many Times You Want to Pass Input:\t");
int n = scan.nextInt();
for (int i = 0; i < n; i++) {
System.out.println("Character Number " + (i + 1) + " is:\t");
try {
obj.addChar(scan.next().charAt(0));
}

catch (Exception e) {
System.out.println(e);
}
}
}
private int total_count;
Ques2() {
this.total_count = 0;
}
public void addChar(char c) throws Exception {
if (!Character.isLetter(c)) {
throw new Exception("Non-alphabetic character passed");
}

this.total_count++;
}

public int getTotalCount() {
return this.total_count;
}
}


3)  Write a program that takes a value at the command line for which  factorial is to be computed. The program must convert the string to  its integer equivalent. There are three possible user input errors that  can prevent the program from executing normally. 
● The first error is when the user provides no argument while  executing the program and an  ArrayIndexOutOfBoundsException is raised. You must write a  catch block for this. 
● The second error is NumberFormatException that is raised in  case the user provides a non-integer (float double) value at the  command line. 
● The third error is IllegalArgumentException. This needs to be  thrown manually if the value at the command line is 0.


public class Ques3 {
public static void main(String[] args) {
System.out.println("Tapas Chatterjee Roll:19");

try {
int n = Integer.parseInt(args[0]);
if (n == 0) {
throw new IllegalArgumentException("Illegal Argument");
}
int factorial = 1;
for (int i = 1; i <= n; i++) {
factorial *= i;
}
System.out.println(n + "! = " + factorial);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Array IndexOutOfBounds Exception ");
} catch (NumberFormatException e) {
System.out.println("Please provide an integer argument");
} catch (IllegalArgumentException e) {
System.out.println(e.getMessage());
}
}
}


4) Create a user-defined exception named CheckArgument to check the  number of arguments passed through the command line. If the  number of arguments is less than 5, throw the  CheckArgumentexception, else print the addition of all the five  numbers. 

class CheckArgument extends Exception{
public CheckArgument(String s){
super(s);
}
public class Ques4 {
public static void main(String[] args) {
System.out.println("Tapas Chatterjee Roll:19");
try {
if (args.length < 5)
throw new CheckArgument("Argument Number is Less than 5.");
else {
int x = 0;
for (String c :
args) {
x += Integer.parseInt(c);
}

System.out.println("The Sum is:\t" + x);
}
}
catch (CheckArgument e){
System.out.println(e);
}
}
}
}

5)Write a java program to create a custom Exception that would handle  at least 2 kinds of Arithmetic Exceptions while calculating a given  equation (e.g. X+Y*(P/Q)Z-I).

package Assignment6;
import java.util.Scanner;
import java.util.Scanner;
class CustomException extends Exception{
public CustomException(String s){
super(s);

}
}
public class Ques6 {
public static void main(String[] args) {
System.out.println("Tapas Chatterjee Roll:19");
Scanner scan = new Scanner(System.in);
int x, y, p , q, z, i;
System.out.print("Value of X = ");
x = scan.nextInt();
System.out.print("Value of Y = ");
y = scan.nextInt();
System.out.print("Value of P = ");
p = scan.nextInt();
System.out.print("Value of Q = ");
q = scan.nextInt();
System.out.print("Value of Z = ");
z = scan.nextInt();
System.out.print("Value of I = ");
i = scan.nextInt();
try {
if (q == 0)
throw new CustomException("Divide By Zero is not Allowed.");
else
System.out.println("The Result is:\t" + (x + y * (p / q) * z - i));
}

catch (CustomException e){
System.out.println(e);
}
}
}




