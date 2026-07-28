select u.user_id,u.name,u.mail
from Users u
where  regexp_like(u.mail, '^[a-zA-Z][A-Za-z0-9_.-]*@leetcode\\.com$','c');