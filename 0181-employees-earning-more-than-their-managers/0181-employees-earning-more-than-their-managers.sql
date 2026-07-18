select employee.name as employee
from Employee employee
join Employee m
on employee.managerid=m.id
where employee.salary>m.salary;