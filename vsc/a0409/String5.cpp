#include <stdio.h>

int main(){
    char greetings[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!', '\0'};
    char greetings2[] = "Hello World!";
    
    printf("%lu\n", sizeof(greetings)); //13
    printf("%lu\n", sizeof(greetings2)); //13 문자열 12문자에 '\0' 까지 포함 13
    return 0;
}