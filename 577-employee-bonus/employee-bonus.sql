Select e.name,b.bonus from Employee e  LEFT JOIN  Bonus  b
ON (e.EmpID=b.empid) where  b.bonus  <1000 or bonus is null; 
