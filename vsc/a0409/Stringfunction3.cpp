#include <stdio.h>
#include <string.h>

int main(){
    char str1[20] = "Hello world!";
    char str2[20];
    strcpy(str2, str1); //str1을 str2 에 복사
    printf("%s\n", str2);  //출력 Hello world!
   
    return 0;
}