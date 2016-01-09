@echo off
set myself=%~dp0
cd jdk && set JAVA_HOME=%myself%\jdk && set path=%JAVA_HOME%\bin && cd ..
call java -Dfile.encoding=UTF-8 -cp %myself%\*;%myself%\target\* org.springframework.boot.loader.JarLauncher --app.root=%myself%
call run.bat