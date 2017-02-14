IF EXIST "parent" (
cd parent
call mvn -Dmaven.test.skip=true clean install source:jar deploy
cd ..
)
call mvn -Dmaven.test.skip=true clean install source:jar deploy
pause