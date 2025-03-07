-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, TO_CHAR(DATE_OF_BIRTH, 'yyyy-mm-dd') DATE_OF_BIRTH
from MEMBER_PROFILE
where TO_CHAR(DATE_OF_BIRTH, 'mm') = '03'
and TLNO is not null
and GENDER = 'W'
order by MEMBER_ID asc;