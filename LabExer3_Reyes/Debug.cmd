@echo off

echo Compiling
cd src
javac -d ../classes main/*.java

cd..

@echo off

echo MakingJar
copy manif.mf classes
cd classes
jar cvfm labExer3.jar manif.mf *

cd..

@echo off

echo Running
echo _________________________________________
cd classes
java -jar labExer3.jar


pause
