1. Display the names and contact numbers of all student members.
Ans- select FName|| ' ' || MName|| ' ' || SName AS Name, Contact_No
 from STUD_MEMBER;
Output-
 
2. Give the names and roll numbers of all students of Information Technology who are 
members.
Ans- select (s.FName|| ' ' || s.MName|| ' ' || s.SName) AS Name, s.Roll_No
from STUD_MEMBER s Inner join DEPARTMENT1 d on d.Dept_ID=s.Dept_ID and 
d.Dept_Name='Information Technology';
Output-
 
3. Display names of Departments whose students are members.
Ans- select distinct Dept_Name from DEPARTMENT1 d 
 Inner join STUD_MEMBER s on d.Dept_ID = s.Dept_ID ;
Output- 
 

 4. Display names of Departments for which no students are members.
Ans- select Dept_Name from DEPARTMENT1 
 where Dept_ID not in(select Dept_ID from STUD_MEMBER);
Output-
 
 5. Display names of all Departments.
Ans- select Dept_Name from DEPARTMENT1;
Output-
 
 6. Find the number ofstudents of Electrical Department who are members.
Ans- select count(s.Dept_ID) AS Number_of_students from STUD_MEMBER s 
 INNER JOIN DEPARTMENT1 d on d.Dept_ID=s.Dept_ID and d.Dept_Name='Electrical';
Output-
 
7. Display information of student members whose name begins with the letter “A”.
Ans- select (s.FName|| ' ' || s.MName|| ' ' || s.SName) as student_members 
 from STUD_MEMBER s where s.FName like 'A%';
Output-
 

 8. Display all details of Male members only.
Ans- select * from STUD_MEMBER where Gender='M';
Output-
 
 9. Display data of student members who are currently in semester ‘’3’’.
Ans- select * from STUD_MEMBER where Semester=3;
Output-
 
 10. Display data of student female members in alphabetical order.
Ans- select * from STUD_MEMBER 
 where Gender='F' order by FName,MName,SName ;
Output-
 

LAB ASSIGNMENT – 3


A. Create Sales table.
Ans- create table Sales (OrderID integer primary key,OrderDate date,OrderPrice numeric,
 OrderQuantity integer,CustomerName varchar(225));
Output -
 
 1. Count how many orders have made a customer with CustomerName of Smith.
Ans- select count(OrderQuantity)as Total_order from sales where customerName = 'Smith';
Output-
 
 2. Find number of unique customers that have ordered from the store.
Ans- select count(distinct customerName) as unique_customers from sales;
Output-
 
 3. Find out total no. of items ordered by all the customers.
Ans- select sum(OrderQuantity) as total_no_of_items from sales;
Output-
 

 4. Find out average number of items per order.
Ans- select avg(OrderQuantity) as Average_no_of_items from sales;
Output-
 
 5. Find out the average OrderQuantity for all orders with OrderPrice greater than 200
Ans- select avg(OrderQuantity) as Average_no_of_items from sales where OrderPrice>200;
Output-
 
 6. Find out what was the minimum price paid for any of the orders.
Ans- select min(OrderPrice) as Minimum_price from sales 
Output-
 
 7. Find out the highest OrderPrice from the given sales table.
Ans- select max(OrderPrice) as Maximum_price from sales 
Output-
 
 8. List out unique customers name only from the table.
Ans- select distinct(CustomerName) from sales;
Output-
 
 9. List out name of the customers who have given order in the month of DECEMBER.
Ans- select CustomerName from sales where orderDate like '%12%';
Output-
 

 10. Find out the total amount of money spent for each of the customers.
Ans- select sum(OrderPrice) as total_amount,CustomerName from sales
 group by CustomerName;
Output-
 
 11. Select all unique customers, who have spent more than 1200 in the store.
Ans- select CustomerName from sales group by CustomerName 
 having sum(OrderPrice)>1200
Output-
 
12. Select all customers that have ordered more than 5 items in total from all their orders.
Ans- select CustomerName,sum(OrderQuantity) as sum from sales 
 group by CustomerName having sum(OrderQuantity)>5
Output-
 
 13. Select all customers who have spent more than 1000, after 10/01/2005.
Ans- select CustomerName from sales 
 where orderDate > '10/01/2005'
 group by CustomerName having sum(OrderPrice)>1000
Output-
 
14. Select orders in increasing order of order price.
Ans- select * from Sales order by OrderPrice asc
Output- 
 
 15. Select orders in decreasing order of order price.
Ans- select * from Sales order by OrderPrice desc;
Output-
