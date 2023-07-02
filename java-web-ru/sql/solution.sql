select first_name, birthday from users
where birthday::timestamp>'10.23.1999'::timestamp
order by first_name
limit 3;