@Echo Off
cd maven-project
echo writing to build.txt
call mvn clean install > ../build.txt
echo finished.