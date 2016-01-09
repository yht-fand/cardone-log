@echo off
echo dist
cd parent && call mvn clean package -Dmaven.test.skip=true && cd ..
call mvn clean package -Dmaven.test.skip=true
rd /s/q dist
mkdir dist\provider
xcopy provider\config dist\provider\config /Y/E/C/R/I
xcopy provider\run.bat dist\provider /Y/C/R/I
xcopy provider\target\cardone-log-provider-*.jar dist\provider /Y/C/R/I
mkdir dist\consumer
xcopy consumer\config dist\consumer\config /Y/E/C/R/I
xcopy consumer\run.bat dist\consumer /Y/C/R/I
xcopy consumer\target\cardone-log-consumer-*.jar dist\consumer /Y/C/R/I
pause