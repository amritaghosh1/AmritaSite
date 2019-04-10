CREATE TABLE food_allergy (
    id INT NOT NULL PRIMARY KEY,
    food VARCHAR(50) NOT NULL,
    given_time TIMESTAMP,
    reaction VARCHAR(1000),
    reaction_noticed_time TIMESTAMP,
    stopped_time TIMESTAMP,
    comment VARCHAR(1000)
);