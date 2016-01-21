@echo off
echo [INFO] Install to local repository.
set myself=%~dp0
cd jdk && set JAVA_HOME=%myself%\jdk && set path=%JAVA_HOME%\bin && cd ..
cd parent && call mvn clean install -Dmaven.test.skip=true && cd ..
call mvn clean install -Dmaven.test.skip=true
pause