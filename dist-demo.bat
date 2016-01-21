@echo off
echo dist-demo
set myself=%~dp0
cd jdk && set JAVA_HOME=%myself%\jdk && set path=%JAVA_HOME%\bin && cd ..
cd parent && call mvn clean package -Dmaven.test.skip=true && cd ..
call mvn clean package -Dmaven.test.skip=true
rd /s/q dist\demo
mkdir dist\demo\provider
xcopy provider\config dist\demo\provider\config /Y/E/C/R/I
xcopy provider\config-demo dist\demo\provider\config /Y/E/C/R/I
xcopy provider\run*.bat dist\demo\provider /Y/C/R/I
xcopy provider\target\cardone*-provider-*.jar dist\demo\provider /Y/C/R/I
mkdir dist\demo\consumer
xcopy consumer\webapp dist\demo\consumer\webapp /Y/E/C/R/I
xcopy consumer\views dist\demo\consumer\views /Y/E/C/R/I
xcopy consumer\config dist\demo\consumer\config /Y/E/C/R/I
xcopy consumer\config-demo dist\demo\consumer\config /Y/E/C/R/I
xcopy consumer\run*.bat dist\demo\consumer /Y/C/R/I
xcopy consumer\target\cardone*-consumer-*.jar dist\demo\consumer /Y/C/R/I
pause