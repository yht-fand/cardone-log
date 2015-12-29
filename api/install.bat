@echo off
echo [INFO] Install to local repository.
cd parent && call mvn clean install -Dmaven.test.skip=true && cd ..
call mvn clean install -Dmaven.test.skip=true
pause