create database db1;
use db1;

create table Emps(
 Empid int primary key auto_increment,
 Empname varchar(20),
 Depid int
 );
 insert into Emps(Empname , Depid)
 values
 ('john',1),
 ('jane',2),
 ('mark',1),
 ('emily',3),
 ('karen',5);
 
 create table Dep(
 Depid int primary key auto_increment,
 Depname varchar(20)
 );
 
 insert into Dep(Depname)
 values
 ('sales'),
 ('hr'),
 ('it'),
 ('marketing'),
 ('null');
 
 create table Project(
 Projid int primary key auto_increment,
 Projname varchar(20),
 Deptid int
 );
 insert into Project(Projid, Projname , Deptid)
 values
 (101, 'Project A' ,1),
 (102, 'Project B ' ,2),
 (103, 'Project C' ,3),
 (104, 'Project D' , 4),
 (105, 'Project E' ,NULL);
 
 select * from Emps;
 select * from Dep;
 select * from Project;
 
 -- -- Retrieve the list of employees along with their department names where employees are associated with departments.

select e.Empid, d.Depname, d.Depid
from emps e
inner join Dep d
on e.Depid=d.Depid;

-- Retrieve all employees and their associated department names. If an employee does not belong to a department, show NULL.
select e.Empname, d.Depname, d.Depid
from emps e
left join Dep d
on e.Depid=d.Depid;

-- Retrieve all departments and the names of employees in those departments. If a department does not have any employees, show NULL.
select e.Empname, d.Depname, d.Depid
from emps e
right join Dep d
on e.Depid=d.Depid;

-- Retrieve all possible combinations of employees and projects.
select e.Empname, p.Deptid, e.Empid, p.Projname
from emps e
inner join Project p
on e.Depid=p.Deptid;

-- Retrieve the list of employees whose department ID is greater than the department ID of 'HR' department.
select e.Empname, d.Depid, d.Depname, e.Depid
from emps e
inner join Dep d
on e.Depid>d.Depid
where d.Depid in (select Depid from Dep where Depname = "HR");

-- Retrieve the list of projects along with their department names, where the projects are associated with departments
select d.Depname,p.Projname, d.Depid, p.Projid
from Dep d
inner join Project p
on p.Deptid=d.Depid;

-- Find employees who are not assigned to any department
select e.Empname,d.Depname,e.Depid,d.Depid
from emps e
right join Dep d
on e.Depid=d.Depid;

-- Find departments that have no employees
select e.Empname,d.Depname,e.Depid,d.Depid
from emps e
right join Dep d
on e.Depid=d.Depid
where e.Depid is null;

-- Find all departments along with the number of employees in each department
select d.Depname,count(e.Depid)
from emps e
inner join Dep d
on e.Depid=d.Depid
Group by e.Depid;

 
 
