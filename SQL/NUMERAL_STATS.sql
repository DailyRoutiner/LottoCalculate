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


insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (1, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (2, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (3, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (4, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (5, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (6, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (7, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (8, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (9, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (10, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (11, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (12, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (13, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (14, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (15, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (16, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (17, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (18, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (19, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (20, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (21, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (22, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (23, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (24, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (25, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (26, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (27, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (28, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (29, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (30, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (31, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (32, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (33, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (34, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (35, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (36, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (37, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (38, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (39, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (40, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (41, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (42, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (43, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (44, null);
insert into numeral_stats (NUMBER_ID, NUMERAL_FREQUENCY) values (45, null);


commit;