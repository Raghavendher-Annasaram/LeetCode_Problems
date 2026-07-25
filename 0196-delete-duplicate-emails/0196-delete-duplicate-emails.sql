delete personEmail2
from Person PersonEmail2
join Person PersonEmail1
on PersonEmail1.email=PersonEmail2.email
where PersonEmail2.id>PersonEmail1.id;