@echo off

:: read current version
set /p v=<currentVersion

:: calculate new version
set v1=%v:~0,1%
set v2=%v:~1,1%
set v3=%v:~2,1%
set /a newVersion=v1*100+v2*10+v3+1

:: write new version to currentVersion file
echo %newVersion% > currentVersion

:: build new version
set v1=%newVersion:~0,1%
set v2=%newVersion:~1,1%
set v3=%newVersion:~2,1%
set pomVersion=%v1%.%v2%.%v3%

:: mvn version set
mvn versions:set -DnewVersion=%pomVersion%
mvn versions:commit