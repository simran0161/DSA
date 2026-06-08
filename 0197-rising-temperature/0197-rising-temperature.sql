# Write your MySQL query statement below
SELECT w.id FROM Weather w CROSS JOIN Weather weather WHERE DATEDIFF(w.recordDate,weather.recordDate)=1 AND w.temperature>weather.temperature;