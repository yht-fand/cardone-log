IF EXIST parent (
cd parent
call mvn clean install
cd ..
)
call mvn clean install
pause