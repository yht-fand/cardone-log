@echo off
echo dist-production
set myself=%~dp0
cd jdk && set JAVA_HOME=%myself%\jdk && set path=%JAVA_HOME%\bin && cd ..
cd parent && call mvn clean package -Dmaven.test.skip=true && cd ..
call mvn clean package -Dmaven.test.skip=true
rd /s/q dist\production
mkdir dist\production\provider
xcopy provider\config dist\production\provider\config /Y/E/C/R/I
xcopy provider\config-production dist\production\provider\config /Y/E/C/R/I
xcopy provider\run*.bat dist\production\provider /Y/C/R/I
xcopy provider\target\cardone*-provider-*.jar dist\production\provider /Y/C/R/I
mkdir dist\production\consumer
xcopy consumer\webapp dist\production\consumer\webapp /Y/E/C/R/I
xcopy consumer\views dist\production\consumer\views /Y/E/C/R/I
xcopy consumer\config dist\production\consumer\config /Y/E/C/R/I
xcopy consumer\config-production dist\production\consumer\config /Y/E/C/R/I
xcopy consumer\run*.bat dist\production\consumer /Y/C/R/I
xcopy consumer\target\cardone*-consumer-*.jar dist\production\consumer /Y/C/R/I
pause