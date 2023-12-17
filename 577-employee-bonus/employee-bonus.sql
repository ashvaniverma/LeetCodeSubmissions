Select e.name,b.bonus from Employee e  LEFT JOIN  Bonus  b
ON (e.EmpID=b.empid) where  bonus  <1000 or bonus is null; 
