select p.user_id,count(p.prompt) as prompt_count,round(avg(p.tokens),2) as avg_tokens
from prompts p
group by p.user_id
having count(prompt)>=3 and exists(select 1
from prompts p2
where p.user_id=p2.user_id and p2.tokens>(select avg(p3.tokens) from prompts p3 where p.user_id=p3.user_id))
order by  avg_tokens desc,p.user_id asc;