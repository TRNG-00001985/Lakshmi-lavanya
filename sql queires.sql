use db1;

select * from Emps;

-- Find the names of employees who work in the same department as 'John'

select Empname
from Emps
where Depid in (select Depid from Emps where Empname="john")
and Empname!="john";

-- Find departments that have more than one employee
select Depname
from Dep
where Depid in (select Depid from Emps group by Depid having count(Depid)>1);

-- Find the projects that are not assigned to any department

select projname
from project
where Deptid is null; 

-- Find the department with the maximum number of employees.

SELECT Depname,
 (SELECT COUNT(Depid) FROM Emps GROUP BY Depid ORDER BY count(Depid) DESC LIMIT 1) 
 AS COUNT1 FROM Dep
 WHERE Depid IN (SELECT Depid FROM Emps GROUP BY Depid ORDER BY count(Depid) DESC ) LIMIT 1;
 
 -- Find employees who are working on projects in the 'Sales' department.
 
select Empname
from Emps
where Depid in (SELECT Depid FROM Dep where Depname="Sales");

-- Find the names of departments that do not have any projects.

SELECT depname
FROM dep
WHERE depid NOT IN (
    SELECT DISTINCT deptid
    FROM project
    WHERE depid IS NOT NULL
);

-- Find employees who are not working on any project. 

SELECT * FROM emps;
Update Emps
SET Deptid=5 where Emptid=5;

SELECT Deptid FROM Project WHERE Deptid IS NOT NULL;

SELECT EmpName From Emp Where Deptid Not IN (SELECT Deptid FROM Project WHERE Deptid IS NOT NULL );

-- Find the department names and the number of employees in each department, only for departments with more than two employees.

SELECT Depname,(SELECT count(Depid) FROM Emps group by Depid Having count(Depid)>1) as count1 FROM Dep
WHERE Depid in (SELECT Depid FROM Emps group by Depid Having count(Depid)>1);

-- Find the projects handled by employees in the 'IT' department.

SELECT Projname From Project WHERE Deptid IN (SELECT Depid FROM Dep where Depname="IT");

-- Find the names of employees who do not work in the 'Marketing' department.

SELECT Empname FROM Emp WHERE Deptid NOT IN (SELECT Depid FROM Dep WHERE Depname="Marketing");



