IF EXIST parent (
cd parent
call mvn clean -Dmaven.test.skip=true package
cd ..
)
call mvn clean -Dmaven.test.skip=true package
rd /s/q dist\%1
mkdir dist\%1\provider
xcopy provider\config dist\%1\provider\config /Y/E/C/R/I
xcopy provider\config-%1 dist\%1\provider\config /Y/E/C/R/I
xcopy provider\run*.* dist\%1\provider /Y/C/R/I
xcopy provider\target\${artifactId!}-provider-*.jar dist\%1\provider /Y/C/R/I
mkdir dist\%1\consumer
xcopy consumer\webapp dist\%1\consumer\webapp /Y/E/C/R/I
xcopy consumer\views dist\%1\consumer\views /Y/E/C/R/I
xcopy consumer\config dist\%1\consumer\config /Y/E/C/R/I
xcopy consumer\config-%1 dist\%1\consumer\config /Y/E/C/R/I
xcopy consumer\run*.* dist\%1\consumer /Y/C/R/I
xcopy consumer\target\${artifactId!}-consumer-*.jar dist\%1\consumer /Y/C/R/I
rd /s/q dist\%1\consumer\config\api\vx
del /s/q *.log
del /s/q *.lock