#include "SysInfo.h"
#include <stdlib.h>

JNIEXPORT jstring JNICALL Java_SysInfo_getString(JNIEnv *env, jclass class, jstring string)
{    
    if(string == NULL)
        return 0;

    const char *_string = (*env)->GetStringUTFChars (env, string, 0);
    printf("%s\n", _string);    
    (*env)->ReleaseStringUTFChars(env, string, _string);

    const char *msg = "Hi i am C\n";

    return (*env)->NewStringUTF(env, msg);

}

JNIEXPORT jint JNICALL Java_SysInfo_getInt(JNIEnv *env, jclass class, jint value)
{
    int _value = value;
    printf("Value int : %d\n", _value);

    return 42;
}

JNIEXPORT jobject JNICALL Java_SysInfo_getFloat(JNIEnv *env, jclass clas, jobject obj)
{
    float *f = (float *)obj;
    printf("Value float : %f\n", *f);

    const float data = 3.1416;

    return (jobject)data;
}