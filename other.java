
1)----The process of finding the largest value (i.e., the maximum of a group of values) is used frequently in computer applications. For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson. The salesperson who sells the most units wins the contest. Build a java application that inputs a series of 10 integers and determines and prints the largest integer. Your program should use at least the following three variables:
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
                 
                 2)---- Using an enhanced for (for-each) loop, copy the content of one 3-dimensional array to another 3-dimensional array and display its contents.
                 
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
                 
                 
      3)----           
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
                 
                 
                 
4)---   Create an interface Department containing attributes deptName and
deptHead. It also has abstract methods for printing the attributes.
Create a class hostel containing hostelName, hostelLocation and
numberofRooms. The class contains methods for getting and
printing the attributes. Then write a Student class extending the
Hostel class and implementing the Department interface. This class
contains attributes studentName, regdNo, electiveSubject and
avgMarks. Write suitable getData and printData methods for this

class. Also, implement the abstract methods of the Department
interface. Write a driver class to test the Student class. The program
should be menu driven containing the options:
i) Admit new student
ii) Migrate a student
iii) Display details of a student
For the third option, a search is to be made on the basis of the entered
registration number.
  
  
  
  
  
  import java.util.ArrayList;
import java.util.Scanner;
interface Department {
String deptName = "";
String deptHead = "";
void printDeptDetails();
}
public class Hostel {
String hostelName;
String hostelLocation;
int numberOfRooms;
Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
this.hostelName = hostelName;
this.hostelLocation = hostelLocation;
this.numberOfRooms = numberOfRooms;

}
void printHostelDetails() {
System.out.println("Hostel Name: " + hostelName);
System.out.println("Hostel Location: " + hostelLocation);
System.out.println("Number of Rooms: " + numberOfRooms);
}
}
class Student extends Hostel implements Department {
String studentName;
int regdNo;
String electiveSubject;
double avgMarks;
Student(String hostelName, String hostelLocation, int numberOfRooms, String studentName,
int regdNo, String electiveSubject, double avgMarks) {
super(hostelName, hostelLocation, numberOfRooms);
this.studentName = studentName;
this.regdNo = regdNo;
this.electiveSubject = electiveSubject;
this.avgMarks = avgMarks;
}
public void printDeptDetails() {
System.out.println("Department Name: " + deptName);
System.out.println("Department Head: " + deptHead);
}
void printStudentDetails() {
System.out.println("Student Name: " + studentName);
System.out.println("Registration Number: " + regdNo);
System.out.println("Elective Subject: " + electiveSubject);
System.out.println("Average Marks: " + avgMarks);
printHostelDetails();

}
}
import java.util.ArrayList;
import java.util.Scanner;
public class Drive {
public static void main(String[] args) {
System.out.println("Name: Tapas Chatterjee Roll: 19");
ArrayList<Student> stu = new ArrayList<>();
Scanner sc = new Scanner(System.in);
while (true) {
System.out.println("Enter the option number:");
System.out.println("1. Admit new student");
System.out.println("2. Migrate a student");
System.out.println("3. Display details of a student");
System.out.println("4. Exit");
int option = sc.nextInt();
switch (option) {
case 1:
System.out.println("Enter Hostel Name:");
String hostelName = sc.next();
System.out.println("Enter Hostel Location:");
String hostelLocation = sc.next();
System.out.println("Enter Number of Rooms:");
int numberOfRooms = sc.nextInt();
System.out.println("Enter Student Name:");
String studentName = sc.next();
System.out.println("Enter Registration Number:");
int regdNo = sc.nextInt();
System.out.println("Enter Elective Subject:");

String electiveSubject = sc.next();
System.out.println("Enter Average Marks:");
double avgMarks = sc.nextDouble();
stu.add(new Student(hostelName, hostelLocation, numberOfRooms, studentName, regdNo,
electiveSubject, avgMarks));
System.out.println("Student Admitted Successfully!");
break;
case 2:
System.out.println("Enter Registration Number of Student to Migrate:");
int regdNoToMigrate = sc.nextInt();
boolean isFound = false;
for (Student student : stu) {
if (student.regdNo == regdNoToMigrate) {
stu.remove(student);
System.out.println("Student Migrated Successfully!");
isFound = true;
break;
}
}
if (!isFound) {
System.out.println("Student not found");
}

case 3:
System.out.println("Enter Registration Number of Student to Display:");
int display = sc.nextInt();
for (Student st : stu) {
if (st.regdNo == display) {
st.printStudentDetails();
}else

System.out.println(" Student Not found");

}
}
}
}
}
                 
                 
