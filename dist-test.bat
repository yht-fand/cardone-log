@echo off
echo dist-test
set myself=%~dp0
cd jdk && set JAVA_HOME=%myself%\jdk && set path=%JAVA_HOME%\bin && cd ..
cd parent && call mvn clean package -Dmaven.test.skip=true && cd ..
call mvn clean package -Dmaven.test.skip=true
rd /s/q dist\test
mkdir dist\test\provider
xcopy provider\config dist\test\provider\config /Y/E/C/R/I
xcopy provider\config-test dist\test\provider\config /Y/E/C/R/I
xcopy provider\run*.bat dist\test\provider /Y/C/R/I
xcopy provider\target\cardone*-provider-*.jar dist\test\provider /Y/C/R/I
mkdir dist\test\consumer
xcopy consumer\webapp dist\test\consumer\webapp /Y/E/C/R/I
xcopy consumer\views dist\test\consumer\views /Y/E/C/R/I
xcopy consumer\config dist\test\consumer\config /Y/E/C/R/I
xcopy consumer\config-test dist\test\consumer\config /Y/E/C/R/I
xcopy consumer\run*.bat dist\test\consumer /Y/C/R/I
xcopy consumer\target\cardone*-consumer-*.jar dist\test\consumer /Y/C/R/I
pause