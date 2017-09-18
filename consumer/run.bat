@echo off
title cardone-log-consumer
set myself=%~dp0


call java -Xms512m -Xmx1024m -Dfile.encoding=UTF-8 -cp %myself%\*;%myself%\target\* org.springframework.boot.loader.JarLauncher --app.root=file:/%myself%

call run.bat