#!/bin/bash

JAVA_INCLUDE=/usr/lib/jvm/java-11-openjdk-amd64/include
JAVA_LIB=/usr/lib/jvm/java-11-openjdk-amd64/lib

cd Java
echo "Compiling classes..."
javac SysInfo.java 
javac Demo.java 
echo "Generating header"
javah -jni SysInfo
echo "Copying header to C folder"
mv SysInfo.h ../C 
cd -
cd C 
echo "Compiling C lib..."
gcc -shared -fpic -o libSysInfo.so -I. -I${JAVA_INCLUDE} -I${JAVA_INCLUDE}/linux SysInfo.c
cp libSysInfo.so ${JAVA_LIB}
chown -R cssouza ${JAVA_LIB}/libSysInfo.so