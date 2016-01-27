@echo off
echo [INFO] Install to local repository.
set myself=%~dp0
IF EXIST jdk (
set JAVA_HOME=%myself%\jdk
set path=%JAVA_HOME%\bin
)
IF EXIST parent (
cd parent
call mvn clean install
cd ..
)
call mvn clean install
pause