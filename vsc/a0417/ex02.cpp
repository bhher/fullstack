#include <stdio.h>
#include <limits.h>

int main(){
    int arr[10] = {5, 12, 8, 3, 15, 7, 9, 20, 1, 18};
    int sum = 0;
    int max = arr[0]; //INT_MIN -2147483648
    int min = arr[0]; //INT_MAX 2147483647
    int size = sizeof(arr) / sizeof(arr[0]);
    double average;
    for(int i=0;i < size;i++){
        sum += arr[i];
        if(arr[i] > max){
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    average =  (double)sum / 10;
    printf("배열의 평균: %.2f\n",average);
    printf("배열의 최대값: %d\n",max);
    printf("배열의 평균: %d\n",min);

    return 0;
}