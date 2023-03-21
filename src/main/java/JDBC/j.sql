CREATE OR REPLACE FUNCTION get_count(tablename text)
    RETURNS int AS
$BODY$
SELECT COUNT(*)
FROM   quote_ident(tablename)
$BODY$    LANGUAGE sql;

CREATE OR REPLACE FUNCTION get_all(tablename text)
    RETURNS setof record AS
$BODY$
SELECT *
FROM  quote_ident(tablename)
$BODY$    LANGUAGE sql;


