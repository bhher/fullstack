#include <stdio.h>

int main(){
    int myNum;
    printf("Type a number and press enter: \n");
    scanf("%d", &myNum); //& 주소를 통해 값을 저장
    printf("Your number is: %d", myNum);

    return 0;
}
// %d 정수 입력 - 변수 int
//%f 실수입력 - 변수타입 float
//%lf 실수입력 = - double
//%s문자열 입력 - char[]
//%c 문자입력 - char
 