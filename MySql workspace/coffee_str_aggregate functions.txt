-- AGGRGATE FUNCTIONS
/*
SUM
COUNT
MIN
MAX
AVG
*/
use coffee_str;
select * from customers;
select count(*) from customers;
-- that COUNT will only calculate not null values
select count(last_name) from customers;
select count(first_name) from customers;
select count(phone_number) from customers;

select count(*) from customers
where last_name='Smith';

select count(*) from customers
where last_name is null;

-- SUM
select * from products;
-- cant do a * function on sum
select sum(price) from products;

select sum(price) from products
where price=3.0;

-- MAX
select max(price) from products;

-- MIN 
select min(price) from products;

-- AVG
select avg(price) from products;

select avg(price) from products
where price>=3.0;
