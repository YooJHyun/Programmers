-- 코드를 입력하세요
SELECT *
from (select a.NAME, a.DATETIME
      from ANIMAL_INS a LEFT JOIN ANIMAL_OUTS b on a.ANIMAL_ID = b.ANIMAL_ID
      where b.ANIMAL_ID is null
      order by a.DATETIME
     )
where rownum < 4;