CREATE TABLE credits (
id SERIAL PRIMARY KEY,
number VARCHAR(20),
owner_id INTEGER REFERENCES clients(id)
);