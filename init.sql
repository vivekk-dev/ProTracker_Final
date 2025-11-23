-- init.sql

-- Create user (if not already exists)
DO
$$
BEGIN
   IF NOT EXISTS (SELECT FROM pg_catalog.pg_roles WHERE rolname = 'protrackr') THEN
      CREATE ROLE protrackr LOGIN PASSWORD 'protrackr';
   END IF;
END
$$;

-- Grant privileges on the already-created "protrackr" DB
GRANT ALL PRIVILEGES ON DATABASE protrackr TO protrackr;
