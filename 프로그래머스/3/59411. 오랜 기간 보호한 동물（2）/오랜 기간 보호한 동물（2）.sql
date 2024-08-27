-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
from (select A.ANIMAL_ID, A.NAME
    from ANIMAL_INS A JOIN ANIMAL_OUTS B on A.ANIMAL_ID = B.ANIMAL_ID 
    order by B.DATETIME - A.DATETIME desc)
where rownum <= 2;