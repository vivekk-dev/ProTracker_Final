#!/bin/sh
set -e

host="$1"
shift
cmd="$@"

echo "Checking Postgres at $host..."

until pg_isready -h "$host" -U "postgres"; do
  echo "Postgres is unavailable - sleeping"
  sleep 2
done

echo "Postgres is up - starting application"
exec $cmd
