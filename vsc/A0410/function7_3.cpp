#include<stdio.h>
int x = 5;
void myFunction(){
    int x = 22;
    printf("%d\n", x);
   
}

int main(){
    myFunction();
    printf("%d\n", x);
    return 0;
}
//int가 4바이트이므로 , 각메모리의 주소의 마지막 숫자는 4가 더해져 다르다.

