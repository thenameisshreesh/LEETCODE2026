# Write your MySQL query statement below
select distinct l.num as ConsecutiveNums from Logs l join Logs l1 on l1.id=l.id+1 join Logs l2 on l2.id=l.id+2 where l.num=l1.num and l1.num = l2.num;