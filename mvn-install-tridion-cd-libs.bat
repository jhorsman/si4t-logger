@echo off
rem Install Tridion Content Delivery libraries and necessary third-party libraries in the local Maven repository

echo Installing SDL Tridion 2013 SP1 libraries into the local Maven repository...
call mvn -q install:install-file -DgroupId=com.tridion -DartifactId=cd_model -Dversion=7.1.0 -Dpackaging=jar -Dfile=cd_model.jar
call mvn -q install:install-file -DgroupId=com.tridion -DartifactId=cd_core -Dversion=7.1.0 -Dpackaging=jar -Dfile=cd_core.jar

echo Finished
pause
