#include <stdio.h>
#include <stdlib.h>
#include "HelloWorld.h"

JNIEXPORT void JNICALL Java_HelloWorld_print(JNIEnv *env, jobject obj)
 {
     printf("Olá Mundo\n");
     return;
 }
