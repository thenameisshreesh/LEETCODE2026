# Write your MySQL query statement below

select w.id as id from Weather w left join Weather t on datediff(w.recordDate,t.recordDate)=1 where w.temperature>t.temperature;