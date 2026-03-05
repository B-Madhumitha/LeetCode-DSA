# Write your MySQL query statement b
SELECT MAX(salary) as SecondHighestSalary from Employee where salary < 
(select MAX(salary) from Employee);