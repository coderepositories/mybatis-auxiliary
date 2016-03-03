@echo off

:: read version
echo "read version"
set /p v=<currentVersion
set /a r = %v% + 1
echo %r%

:: set version
:: mvn versions:set -DnewVersion=%v%
:: mvn versions:commit


