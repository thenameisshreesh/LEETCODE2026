# Write your MySQL query statement below

select s.name as name from SalesPerson s left join Orders o on o.sales_id=s.sales_id and o.com_id=(select com_id from Company where name='RED') where o.sales_id is null;