#include<stdio.h>
int main(){
    int a,b,c;
    int max;
    printf("세 수를 입력하세요:");
    scanf("%d %d %d", &a, &b,&c);
    max = a; //먼저 a를 최대값으로 가정

    if(b > max ){
        max = b;
    }
    if(c > max){
        max = c;
    }
    
    printf("가장 큰 수는 %d 입니다.\n",max);
    return 0;
}