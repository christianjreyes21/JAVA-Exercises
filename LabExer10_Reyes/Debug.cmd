@echo off

echo Compiling
cd src
javac -d ../classes *.java

cd..

@echo off

echo MakingJar
copy manif.mf classes
cd classes
jar cvfm LabExer10_Reyes.jar manif.mf *

cd..

@echo off

echo Running
echo _________________________________________
cd classes
java -jar LabExer10_Reyes.jar 


pause
