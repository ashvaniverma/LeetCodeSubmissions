/*  WITH CTE as (
SELECT customer_number ,COUNT(order_number)  AS NUMORDER
FROM Orders 
GROUP BY customer_number)

SELECT CUSTOMER_NUMBER 
FROM CTE WHERE NUMORDER = (SELECT max(NUMORDER) FROM cte);

Write your PL/SQL query statement below */
SELECT customer_number
FROM (
    SELECT customer_number, COUNT(order_number) AS order_count
    FROM orders
    GROUP BY customer_number
    ORDER BY order_count DESC
)
WHERE ROWNUM = 1;