CREATE TABLE court (
    number_process TEXT NOT NULL,
    forum_name TEXT NOT NULL,
    forum_number INTEGER NOT NULL,
    author TEXT NOT NULL,
    defendant TEXT NOT NULL,
    procedural_situation TEXT NOT NULL,
    process_status TEXT NOT NULL,
    pending TEXT,
    observation TEXT,
    process_date DATE,
    partner TEXT,
    department TEXT NOT NULL,
    win_or_lose BOOLEAN
)