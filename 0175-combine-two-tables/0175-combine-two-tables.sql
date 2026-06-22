# Write your MySQL query statement below
Select firstName,lastName,city,state from Person p LEFT JOIN Address a ON p.personId=a.personid;
