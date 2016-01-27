@echo off
echo deploy
IF EXIST parent (
cd parent
call mvn clean install source:jar deploy
cd ..
)
call mvn clean install source:jar deploy