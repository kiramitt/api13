DROP TABLE IF EXISTS books CASCADE;
DROP SEQUENCE IF EXISTS global_sec;
CREATE SEQUENCE global_sec START WITH 1;
CREATE TABLE books(
    id          INTEGER PRIMARY KEY DEFAULT nextval('global_sec'),
    name        VARCHAR         NOT NULL,
    author       VARCHAR         NOT NULL,
    publishingyear       INTEGER         NOT NULL,
    language    VARCHAR         NOT NULL
);