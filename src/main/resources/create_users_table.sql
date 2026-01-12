CREATE TABLE IF NOT EXISTS users (
    id UUID PRIMARY KEY,
    username VARCHAR(20) NOT NULL,
    password TEXT NOT NULL,
    description VARCHAR(20)
);
