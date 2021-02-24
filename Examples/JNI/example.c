#include "Example.h"
#include <stdio.h>

JNIEXPORT jint JNICALL Java_Example_callNative(JNIEnv *env, jobject object, jint iParam, jchar cParam)
  {
    char c;
    c = ( char ) cParam;
    printf( "Implementacao Nativa recebeu como parametros: %d e '%c'\r\n", iParam, c) ;
    return iParam + 10;

  }