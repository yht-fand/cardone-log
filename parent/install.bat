set myself=%~dp0
IF EXIST jdk (
set JAVA_HOME=%myself%jdk
set path=%JAVA_HOME%\bin
)
call mvn clean install
pause