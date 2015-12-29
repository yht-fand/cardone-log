@echo off
echo deploy
call mvn clean install source:jar deploy -Dmaven.test.skip=true
pause