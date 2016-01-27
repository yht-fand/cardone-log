echo run
myself="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
if [ -e 'jdk' ]; then
export JAVA_HOME=$myself\jdk
export PATH=$JAVA_HOME\bin:$PATH
fi
java -Dfile.encoding=UTF-8 -cp $myself\*;$myself\target\* org.springframework.boot.loader.JarLauncher --app.root=$myself
./run.sh