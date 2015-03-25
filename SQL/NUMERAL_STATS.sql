DROP table "NUMERAL_STATS";

CREATE table "NUMERAL_STATS" (
    "NUMBER_ID"         NUMBER NOT NULL,
    "NUMERAL_FREQUENCY" NUMBER,
    "TURN_FK"           NUMBER,
    "UNIT_ID_FK"        VARCHAR2(30),
    constraint  "NUMERAL_STATS_PK" primary key ("NUMBER_ID")
);


ALTER TABLE "NUMERAL_STATS" ADD CONSTRAINT "NUMERAL_STATS_FK" 
FOREIGN KEY ("TURN_FK")
REFERENCES "TOTAL_RESULT" ("TURN");


ALTER TABLE "NUMERAL_STATS" ADD CONSTRAINT "NUMERAL_STATS_FK2" 
FOREIGN KEY ("UNIT_ID_FK")
REFERENCES "UNIT_STATS" ("UNIT_ID");


insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (1, 'A');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (2, 'A');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (3, 'A');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (4, 'A');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (5, 'A');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (6, 'A');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (7, 'A');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (8, 'A');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (9, 'A');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (10, 'B');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (11, 'B');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (12, 'B');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (13, 'B');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (14, 'B');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (15, 'B');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (16, 'B');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (17, 'B');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (18, 'B');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (19, 'B');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (20, 'C');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (21, 'C');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (22, 'C');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (23, 'C');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (24, 'C');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (25, 'C');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (26, 'C');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (27, 'C');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (28, 'C');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (29, 'C');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (30, 'D');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (31, 'D');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (32, 'D');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (33, 'D');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (34, 'D');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (35, 'D');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (36, 'D');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (37, 'D');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (38, 'D');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (39, 'D');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (40, 'E');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (41, 'E');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (42, 'E');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (43, 'E');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (44, 'E');
insert into numeral_stats (NUMBER_ID, UNIT_ID_FK) values (45, 'E');


commit;