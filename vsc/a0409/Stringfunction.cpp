#include <stdio.h>
#include <string.h>

int main(){
    char alphabet[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    printf("%d", strlen(alphabet)); //26
    printf("%d", sizeof(alphabet)); //27 \0  null문자 포함
    return 0;
}