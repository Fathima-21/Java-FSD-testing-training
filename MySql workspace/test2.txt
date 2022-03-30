create database test2;
use test2;
show tables;

create table people(
id int auto_increment primary key,
name varchar(30),
age int,
gender enum('M','F')
);

insert into people(name,age,gender)
values ('Emma',21,'F'),('John',30,'M'),('Thomas',27,'M'),('Chris',44,'M'),('Sally',23,'F'),('Frank',55,'M');

select * from people;
set sql_safe_updates=0;
-- deleting a selected row
delete from people
where name='John';
-- deleting multiple rows
delete from people
where gender='F';
-- to delete all the data
delete from people;
