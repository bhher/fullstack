#include<stdio.h>

int main(){
    int myNumbers[4] = {25, 50, 75, 100};
    int i;
    
    
      printf("%d\n", *myNumbers);
      printf("%d\n", *(myNumbers+1));
      printf("%d\n", *(myNumbers+2));
    return 0;
}
//int가 4바이트이므로 , 각메모리의 주소의 마지막 숫자는 4가 더해져 다르다.

