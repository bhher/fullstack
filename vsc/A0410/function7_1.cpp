#include<stdio.h>

void myFunction(){
    int x = 5;
   
}

int main(){
    myFunction();
    printf("%d", x);//지역변수 접근 하려하면 오류
    return 0;
}
//int가 4바이트이므로 , 각메모리의 주소의 마지막 숫자는 4가 더해져 다르다.

