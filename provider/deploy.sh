if [ -e 'parent' ]; then
cd parent
call mvn -Dmaven.test.skip=true clean install source:jar deploy
cd ..
fi
call mvn -Dmaven.test.skip=true clean install source:jar deploy
