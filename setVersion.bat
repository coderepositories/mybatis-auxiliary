@echo off

:: read version
echo "read version"
set /p v=<currentVersion

:: set version
mvn versions:set -DnewVersion=%v%
mvn versions:commit


