#include <stdio.h>
#include <string.h>
//"hello"라면 출력은 "olleh"가 되어야 합니다.
int main(){
    char str[100];
    int length;
    char temp;
    printf("문자열을 입력하세요: ");
    scanf("%s",str); //공백없는 문자열 입력 가정
    length = strlen(str); //strlen 문자의 갯수를 알아보는 메서드
    printf("문자갯수: %d\n",length);
    //hello
    //양쪽끝에서 가운데로 이동하며 문자 교환
    for (int i=0; i < length /2; i++){
        temp = str[i];
        str[i] = str[length-1-i];
        str[length - 1 - i] = temp;
    }
    printf("뒤집어진 문자열: %s\n",str);
    return 0;
}