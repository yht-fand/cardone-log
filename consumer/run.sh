@echo off
echo run
myself="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd jdk && set JAVA_HOME=$myself\jdk && PATH=$JAVA_HOME\bin:$PATH && cd $myself
call java -Dfile.encoding=UTF-8 -cp $myself\*;$myself\target\* org.springframework.boot.loader.JarLauncher --app.root=$myself
call run.sh