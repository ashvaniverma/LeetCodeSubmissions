Select c1.name as Customers from Customers c1 where c1.ID not in  (Select c.ID from Customers c JOIN ORDERS o
ON (c.id=o.customerID));