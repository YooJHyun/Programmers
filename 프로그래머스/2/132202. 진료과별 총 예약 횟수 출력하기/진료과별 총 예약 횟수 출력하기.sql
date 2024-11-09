-- 코드를 입력하세요
SELECT MCDP_CD as 진료과코드,
     COUNT(*) as "5월예약건수"
from APPOINTMENT
group by MCDP_CD, TO_CHAR(APNT_YMD, 'MM')
having TO_CHAR(APNT_YMD, 'MM') in ('05')
order by COUNT(*) asc, MCDP_CD asc;