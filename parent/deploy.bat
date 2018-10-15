IF EXIST "parent" (
cd parent
call mvn -Dmaven.test.skip=true clean deploy
cd ..
)
call mvn -Dmaven.test.skip=true clean deploy
pause