-- Create dedicated application user
CREATE USER protrackr WITH PASSWORD 'protrackr';

-- Create app database if not already created
CREATE DATABASE protrackr OWNER protrackr;

-- Grant privileges
GRANT ALL PRIVILEGES ON DATABASE protrackr TO protrackr;
