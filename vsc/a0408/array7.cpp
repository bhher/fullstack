#include <stdio.h>

int main(){
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
    float avg=0 , sum = 0;
    int i;
    int length = sizeof(ages) / sizeof(ages[0]);
    for (i = 0; i < length; i++) {
        sum += ages[i];
      }
      avg = sum / length;
  
      // Print the average
    printf("The average age is: %.2f", avg);
    return 0;
}
//int 는 보통 4byte를 사용 4 * 5 = 20