@echo off
rem Install Tridion Content Delivery libraries and necessary third-party libraries in the local Maven repository

echo Installing SI4T libraries into the local Maven repository...
call mvn -q install:install-file -DgroupId=org.si4t -DartifactId=si4t -Dversion=1.0 -Dpackaging=jar -Dfile=si4t.jar

echo Finished
pause
