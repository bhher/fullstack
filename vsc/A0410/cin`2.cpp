#include <iostream>
#include <string>
using namespace std;
//주석이용
int main() {
    string line;
    cout << "Type a full sentence: ";
    getline(cin, line);  // 공백 포함 전체 문장 입력
    cout << "You wrote: " << line;
    return 0;
}