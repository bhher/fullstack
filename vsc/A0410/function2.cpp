#include<stdio.h>

void myFunction(char name[], int age){
    printf("Hello %s, you are %d years old\n", name, age);
}

int main(){
    myFunction("Liam", 3);
    myFunction("Jenny", 14);
    myFunction("Anja", 30);
    return 0;
}
//int가 4바이트이므로 , 각메모리의 주소의 마지막 숫자는 4가 더해져 다르다.

