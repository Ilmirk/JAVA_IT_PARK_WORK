CREATE TABLE delivery (
id SERIAL PRIMARY KEY,
products VARCHAR(20),
owner_id INTEGER REFERENCES clients(id)
);