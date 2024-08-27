-- 코드를 입력하세요
SELECT count(*) from USER_INFO where TO_CHAR(JOINED,'YYYY') = '2021' and AGE >= 20 and AGE <= 29