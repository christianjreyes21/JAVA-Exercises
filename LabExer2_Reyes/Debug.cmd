@echo off

echo Compiling
cd src
javac -d ../classes com/UST/test/TestStudent.java
cd..

@echo off

echo MakingJar
copy manif.mf classes
cd classes
jar cvfm labExer2.jar manif.mf *

cd..

@echo off

echo Running
echo _________________________________________
cd classes
java -jar labExer2.jar


pause
