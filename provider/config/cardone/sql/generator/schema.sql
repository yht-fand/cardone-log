drop table if exists c1_send_test;

CREATE TABLE c1_send_test (
	ID VARCHAR(36) NOT NULL,
	CREATED_DATE TIME,
	UPDATE_DATE TIME
    PRIMARY KEY (ID)
);