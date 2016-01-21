@echo off
echo deploy
set myself=%~dp0
cd jdk && set JAVA_HOME=%myself%\jdk && set path=%JAVA_HOME%\bin && cd ..
call mvn clean install source:jar deploy -Dmaven.test.skip=true
pause