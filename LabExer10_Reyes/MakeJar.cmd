@echo off

echo MakingJar
copy manif.mf classes
cd classes
jar cvfm labExer2.jar manif.mf *