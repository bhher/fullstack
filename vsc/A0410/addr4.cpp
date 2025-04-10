#include<stdio.h>

int main(){
    int myAge = 43;
    int *ptr = &myAge;
    printf("%d\n",myAge); //myage 값
    printf("%p\n",&myAge); //myage 주소
    printf("%p\n",ptr); //포인터 변수 ptr의주소
    printf("%d\n", *ptr);
    return 0;
}
