cd C:\Program Files\MySQL\MySQL Server 8.0\bin
@echo off
rem mysql -u root -pMrachita01 -h localhost
mysql -u root -h localhost -p < C:\RACHITAK\orms\database\builddatabase.sql
pause