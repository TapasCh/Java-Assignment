1. From the following table, create a view for those salespeople who belong to the city of
New York.

CREATE VIEW ny_salespeople AS
SELECT *
FROM salesman
WHERE city = 'New York';
Select * from ny_salespeople;

2. From the following table, create a view for all salespersons. Return salesperson ID, name,
and city.
CREATE VIEW salesperson_details AS
SELECT salesman_id,name,city
FROM salesman;

3. From the following table, create a view to locate the salespeople in the city 'New York'.

CREATE VIEW ny_salespeople AS
SELECT *
FROM salesman
WHERE city = 'New York';

4. From the following table, create a view that counts the number of customers in each grade.
CREATE VIEW cust_count AS
SELECT count(*),grade
FROM customer
GROUP BY grade;

5. From the following table, create a view to count the number of unique customers, compute
the average and the total purchase amount of customer orders by each date.

CREATE VIEW customer_orders_view AS
SELECT ord_date, COUNT(DISTINCT customer_id) AS unique_customers,
AVG(purch_amt) AS avg_purchase_amt, SUM(purch_amt) AS total_purchase_amt
FROM orders
GROUP BY ord_date;

6. From the following tables, create a view to get the salesperson and customer by name.
Return order name, purchase amount, salesperson ID, name, customer name.

CREATE VIEW salesperson_customer_view AS
SELECT o.ord_no, o.purch_amt, o.salesman_id, s.name AS salesman_name,
c.cust_name
FROM orders o
JOIN salesman s ON o.salesman_id = s.salesman_id
JOIN customer c ON o.customer_id = c.customer_id;

7. From the following table, create a view to find the salesperson who handles a customer
who makes the highest order of the day. Return order date, salesperson ID, name.
CREATE VIEW highest_order_salesperson_view AS
SELECT o.ord_date, o.salesman_id, s.name
FROM orders o
JOIN salesman s ON o.salesman_id = s.salesman_id
WHERE o.purch_amt = (SELECT MAX(purch_amt) FROM orders WHERE ord_date =
o.ord_date AND customer_id = o.customer_id);

8. From the following table, create a view to find the salesperson who deals with the
customer with the highest order at least three times per day. Return salesperson ID and name.
CREATE VIEW high_order_customer_salesperson_view AS
SELECT o.salesman_id, s.name
FROM orders o
JOIN salesman s ON o.salesman_id = s.salesman_id
WHERE o.customer_id IN (
SELECT customer_id FROM orders WHERE ord_date = o.ord_date GROUP BY
customer_id HAVING COUNT(*) >= 3 AND MAX(purch_amt) = (SELECT MAX(purch_amt)
FROM orders WHERE ord_date = o.ord_date AND customer_id = o.customer_id)
);

9. From the following table, create a view to find all the customers who have the highest
grade. Return all the fields of customer.
CREATE VIEW highest_grade_customers_view AS
SELECT *
FROM customer
WHERE grade = (SELECT MAX(grade) FROM customer);

10. From the following table, create a view to count the number of salespeople in each city.
Return city, number of salespersons.
CREATE VIEW salespeople_per_city_view AS
SELECT city, COUNT(*) AS num_salespeople
FROM salesman
GROUP BY city;

11. From the following table, create a view to compute the average purchase amount and total
purchase amount for each salesperson. Return name, average purchase and total purchase
amount. (Assume all names are unique.).
CREATE VIEW salesperson_purchase_view AS
SELECT s.name, AVG(o.purch_amt) AS avg_purchase_amt, SUM(o.purch_amt) AS
total_purchase_amt
FROM orders o
JOIN salesman s ON o.salesman_id = s.salesman_id
GROUP BY s.name;

12. From the following table, create a view to identify salespeople who work with multiple
clients. Return all the fields of salesperson.
CREATE VIEW multi_client_salesperson_view AS
SELECT *
FROM salesman
WHERE salesman_id IN (
SELECT salesman_id FROM orders GROUP BY salesman_id HAVING COUNT(DISTINCT
customer_id) > 1
);

13. From the following table, create a view that shows all matching customers with
salespeople, ensuring that at least one customer in the city of the customer is served by the
salesperson in the city of the salesperson.
CREATE VIEW matched_customers_salespeople_view AS
SELECT DISTINCT c.customer_id, c.cust_name, c.city AS customer_city,
s.salesman_id, s.name AS salesman_name, s.city AS salesman_city
FROM customer c
JOIN orders o ON c.customer_id = o.customer_id
JOIN salesman s ON o.salesman_id = s.salesman_id
WHERE EXISTS (
SELECT 1 FROM customer c2 JOIN orders o2 ON c2.customer_id =
o2.customer_id WHERE c2.city = s.city AND o2.salesman_id = s.salesman_id
);

14. From the following table, create a view to display the number of orders per day. Return
order date and number of orders.
CREATE VIEW orders_per_day AS
SELECT ord_date, COUNT(*) AS num_orders
FROM orders
GROUP BY ord_date;

15. From the following table, create a view to find the salespeople who placed orders on
October 10th, 2012. Return all the fields of salesperson.
CREATE VIEW salespeople_on_oct_10 AS
SELECT salesman.*
FROM salesman
JOIN orders ON salesman.salesman_id = orders.salesman_id
WHERE orders.ord_date = '2012-10-10';

16. From the following table, create a view to find the salespersons who issued orders on
either August 17th, 2012 or October 10th, 2012. Return salesperson ID, order number and
customer ID.
CREATE VIEW salespersons_orders_aug_oct AS
SELECT orders.salesman_id, orders.ord_no, orders.customer_id
FROM orders
WHERE orders.ord_date IN ('2012-08-17', '2012-10-10');
