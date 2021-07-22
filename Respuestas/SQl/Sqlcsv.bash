#!/bin/bash
psql  psql  su postgres
create database Test;
CREATE TABLE TLDCSV 
   (TLD Varchar(25 )PRIMARY KEY NOT NULL,  
Cantidad int NOT NULL) ;
while IFS= read -r line
do
  echo "$line"
INSERT INTO TLDCSV (TLD, Cantidad) values ($line);
done < TLD.csv