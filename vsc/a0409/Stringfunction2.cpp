#include <stdio.h>
#include <string.h>

int main(){
    char str1[20] = "Hello ";
    char str2[] = "world!";
    strcat(str1, str2); //str2를 st1에 붙임
    printf("%s\n", str1);  //출력 Hello world!
   
    return 0;
}