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


insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (1, 119, 'A');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (2, 104, 'A');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (3, 97, 'A');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (4, 108, 'A');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (5, 101, 'A');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (6, 97, 'A');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (7, 99, 'A');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (8, 108, 'A');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (9, 79, 'A');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (10, 97, 'B');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (11, 98, 'B');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (12, 98, 'B');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (13, 107, 'B');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (14, 108, 'B');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (15, 95, 'B');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (16, 94, 'B');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (17, 110, 'B');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (18, 98, 'B');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (19, 97, 'B');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (20, 118, 'C');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (21, 94, 'C');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (22, 86, 'C');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (23, 91, 'C');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (24, 98, 'C');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (25, 102, 'C');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (26, 107, 'C');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (27, 119, 'C');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (28, 84, 'C');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (29, 86, 'C');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (30, 92, 'D');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (31, 102, 'D');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (32, 91, 'D');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (33, 102, 'D');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (34, 113, 'D');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (35, 100, 'D');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (36, 93, 'D');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (37, 111, 'D');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (38, 94, 'D');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (39, 102, 'D');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (40, 114, 'E');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (41, 83, 'E');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (42, 93, 'E');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (43, 113, 'E');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (44, 96, 'E');
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY, UNIT_ID_FK) values (45, 96, 'E');


commit;