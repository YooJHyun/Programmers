-- 코드를 입력하세요
SELECT B.TITLE, B.BOARD_ID, R.REPLY_ID, R.WRITER_ID, R.CONTENTS, TO_CHAR(R.CREATED_DATE, 'YYYY-MM-DD') as CREATED_DATE
from USED_GOODS_BOARD B
inner join USED_GOODS_REPLY R on B.BOARD_ID = R.BOARD_ID
where TO_CHAR(B.CREATED_DATE, 'YYYYMM') = '202210'
order by R.CREATED_DATE, B.TITLE asc;