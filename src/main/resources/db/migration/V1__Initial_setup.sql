CREATE TABLE flow_user (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

INSERT INTO flow_user(name)
VALUES ('user1');

