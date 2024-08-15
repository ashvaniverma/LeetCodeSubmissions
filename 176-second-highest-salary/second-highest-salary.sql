select MAX(salary) as SecondHighestSalary from Employee Where salary not in (select MAX(salary) from Employee);
