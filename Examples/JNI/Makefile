all:
	gcc -fPIC -I/usr/lib/jvm/java-11-openjdk-amd64/include -I/usr/lib/jvm/java-11-openjdk-amd64/include/linux -c example.c -o example.o
	gcc -shared -o libnative.so example.o
	mv libnative.so build
	mv example.o build