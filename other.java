
The process of finding the largest value (i.e., the maximum of a group of values) is used frequently in computer applications. For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson. The salesperson who sells the most units wins the contest. Build a java application that inputs a series of 10 integers and determines and prints the largest integer. Your program should use at least the following three variables:
counter: A counter to count to 10 (i.e. to keep track of how many numbers have been input and to determine when all 10 numbers have been processed.
number: The inter most recently input by the user.
largest: The largest number found so far.
Note: Every time the sales figure of one employee is entered, the application should ask the user if they want to enter any more sales figures of a salesperson!


import java.util.Scanner;
public class Salesfind {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number[]=new int[10];
int largest =Integer.MIN_VALUE;
int count=1; String tryagain;
while(count<10) {
for(int i=1;i<number.length;i++) {
System.out.println("Enter the sales for "+i+" th

product");

number[i]=sc.nextInt();
if(number[i]>largest)
largest=number[i];

}
System.out.print("Do you want to enter any more data?

(yes/no): ");
sc.nextLine();
tryagain = sc.nextLine();
if (tryagain.equalsIgnoreCase("no")) {
break;
}
count++;
}

System.out.println("The largest sales of the product is: " + largest);
}
}
                 
                 
                 Using an enhanced for (for-each) loop, copy the content of one 3-dimensional array to another 3-dimensional array and display its contents.
                 
                 public class Problem4 {
public static void main(String[] args) {

System.out.println(" Name : Tapas Chatterjee Roll:19");

int[][][] arr1 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
int[][][] arr2 = new

int[arr1.length][arr1[0].length][arr1[0][0].length];

for (int i = 0; i < arr1.length; i++) {
for (int j = 0; j < arr1[i].length; j++) {
System.arraycopy(arr1[i][j], 0, arr2[i][j], 0, arr1[i][j].length);
}
}

System.out.println(" The final arr2 is : ");
// Display the contents of arr2
for (int[][] arr2D : arr2) {
for (int[] arr1D : arr2D) {
for (int num : arr1D) {

System.out.print(num + " ");
}
System.out.println();
}
System.out.println();
}

}
}
                 
                 
                 
                 ************
\                    / 
/                    \ 
\                    / 
/                    \
\                    / 
/                    \
************

                 
                 public class Program5 {
public static void main(String[] args) {
System.out.println(" Name : Tapas Chatterjee Roll_No:19");

int vaseHeight = 12;

for (int i = 1; i <= vaseHeight; i++) {
System.out.print("*");
}
System.out.println();

for (int i = 1; i <= 6; i++) {
for (int j = 1; j <=12 ; j++) {
if (i %2==0 && j==1) {
System.out.print("/");
} else if(i %2==0 && j==12) {
System.out.println("\\");
}
else if(i %2!=0 && j==12) {
System.out.println("/");
}
else if(i %2!=0 && j==1) {
System.out.println("\\");
}
else {
System.out.print(" ");
}
}
System.out.println();
}

for (int i = 1; i <= vaseHeight; i++) {
System.out.print("*");
}
}
}
