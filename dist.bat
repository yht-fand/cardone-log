IF EXIST parent (
cd parent
call mvn clean -Dmaven.test.skip=true package
cd ..
)
call mvn clean -Dmaven.test.skip=true package
rd /s/q dist\%1
mkdir dist\%1\cardone-log\provider
xcopy provider\config dist\%1\cardone-log\provider\config /Y/E/C/R/I
xcopy provider\config-%1 dist\%1\cardone-log\provider\config /Y/E/C/R/I
xcopy provider\run*.* dist\%1\cardone-log\provider /Y/C/R/I
xcopy provider\target\cardone-log-provider-*.jar dist\%1\cardone-log\provider /Y/C/R/I
mkdir dist\%1\cardone-log\consumer
xcopy consumer\webapp dist\%1\cardone-log\consumer\webapp /Y/E/C/R/I
xcopy consumer\views dist\%1\cardone-log\consumer\views /Y/E/C/R/I
xcopy consumer\config dist\%1\cardone-log\consumer\config /Y/E/C/R/I
xcopy consumer\config-%1 dist\%1\cardone-log\consumer\config /Y/E/C/R/I
xcopy consumer\run*.* dist\%1\cardone-log\consumer /Y/C/R/I
xcopy consumer\target\cardone-log-consumer-*.jar dist\%1\cardone-log\consumer /Y/C/R/I
rd /s/q dist\%1\cardone-log\consumer\config\api\vx
del /s/q *.log
del /s/q *.lock