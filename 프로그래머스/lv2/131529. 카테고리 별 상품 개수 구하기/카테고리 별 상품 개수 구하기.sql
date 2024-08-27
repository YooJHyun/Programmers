-- 코드를 입력하세요
SELECT substr(PRODUCT_CODE, 0, 2) as CATEGORY, 
    COUNT(*) as PRODUCTS from PRODUCT 
    group by substr(PRODUCT_CODE, 0, 2) 
    order by CATEGORY