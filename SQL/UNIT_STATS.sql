DROP table "UNIT_STATS";

CREATE table "UNIT_STATS" (
    "UNIT_ID"        VARCHAR2(30) NOT NULL,
    "UNIT_NUMBER"    NUMBER,
    "UNIT_FREQUENCY" NUMBER,
    constraint  "UNIT_STATS_PK" primary key ("UNIT_ID")
    );

commit;