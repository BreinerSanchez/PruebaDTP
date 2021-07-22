#!/bin/bash
psql  psql  su postgres
psql -h localhost -U postgres -d Test
CREATE TABLE TLDTXT 
   (TLD Varchar(25 )PRIMARY KEY NOT NULL,  
Cantidad int NOT NULL);
while IFS= read -r line
do
  echo "$line"
INSERT INTO TLDTXT (TLD, Cantidad) values ($line);
done < /workspaces/L2-Test-main/data/dominios.txt