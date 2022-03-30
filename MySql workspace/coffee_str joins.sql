use coffee_str;
select * from products;
select * from orders;
select * from customers;

-- JOINS
-- INNER JOIN
-- product name field from products table and order_time from the orders table
/*select <table1>.column,<table2>.column from <table1>
inner join <table2> on <table1>.column=<table2>.column;
inner join <table3> on <table3>.colummn=<table2>.column */

select products.name,orders.order_time from orders
inner join products on products.id=orders.product_id;

select products.name,orders.order_time from orders
inner join products on products.id=orders.product_id
where products.name='Filter'
and orders.order_time between '2017-01-14' and '2017-01-31'
order by orders.order_time;


select p.name,p.price,o.order_time from orders o
join products p on p.id=o.product_id
order by o.order_time asc;

select p.name,p.price,o.order_time from orders o
join products p on p.id=o.product_id
where p.id=5
order by order_time asc;

select * from orders;

update orders
set customer_id=null
where id=1;
-- left join
-- Orders LEFT JOIN ON customers
select o.id,c.last_name,c.phone_number,o.order_time from orders o
left join customers c on o.customer_id=c.id
order by o.order_time
limit 10;

-- by inter changining the table-1 and table-2 positions
select o.id,c.last_name,c.phone_number,o.order_time from customers c
left join orders o on c.id=o.customer_id
order by o.order_time
limit 10;

-- RIGHT JOIN
-- Customers RIGHT JOIN on Orders
select o.id,c.last_name,c.phone_number,o.order_time from customers c
right join orders o on c.id=o.customer_id
order by o.order_time
limit 10;

select o.id,c.last_name,c.phone_number,o.order_time from  orders o
right join customers c on o.customer_id=c.id
order by o.order_time
limit 10;

update orders
set customer_id=1
where id=1;

-- all the tables join
select * from orders;
select * from customers;
select * from products;


select p.name,p.price,c.first_name,c.last_name,o.order_time from products p
join orders o on p.id=o.product_id
join customers c on o.customer_id=c.id;

select p.name,p.price,c.first_name,c.last_name,o.order_time from products p
join orders o on p.id=o.product_id
join customers c on o.customer_id=c.id
where c.last_name='Martin'
order by o.order_time;

/*Exercise-1
1) select order id and customers phone number for all orders of product id 4.
2)select product name and order time for filter coffees sold between january 15th 2017 and february 14th 2017.
3)select the product name and the price and order time for all the orders from femails in january 2017.*/

select orders.id,customers.phone_number from orders
join customers on orders.customer_id=customers.id
where product_id=4;

select products.name,orders.order_time from orders
join products on products.id= orders.product_id
where order_time between '2017-01-15' and '2017-02-14'
and products.name='Filter';

select products.name,products.price,orders.order_time from products
join orders on products.id=orders.product_id
join customers on orders.customer_id=customers.id
where gender='F' and
order_time between '2017-01-01' and '2017-01-31';

