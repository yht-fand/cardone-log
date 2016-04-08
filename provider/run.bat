@echo off
title cardone-log-provider
set myself=%~dp0
IF EXIST jdk (
set JAVA_HOME=%myself%\jdk
set path=%JAVA_HOME%\bin
)
call java -Dfile.encoding=UTF-8 -cp %myself%\*;%myself%\target\* org.springframework.boot.loader.JarLauncher --app.root=%myself%
call run.bat