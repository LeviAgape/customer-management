CREATE TABLE finance(
    number_process TEXT PRIMARY KEY,
    value_process FLOAT NOT NULL,
    portion FLOAT NOT NULL,
    percent FLOAT,
    value_percent FLOAT,
    FOREIGN KEY (number_process) REFERENCES court (number_process)
)