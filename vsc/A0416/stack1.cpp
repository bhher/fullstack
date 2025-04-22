#include <iostream>
#include <stack>
using namespace std;
int main(){
   stack<int> s;
   //LIFO(Last in first out)
   //스택을 값을 넣기(push)
   s.push(10);
   s.push(20);
   s.push(30);
   cout << "현재 스택의 맨 위 값 : " << s.top() << endl; //

    //스택에서 값꺼내기
    s.pop();
    cout << "현재 스택의 맨 위 값 : " << s.top() << endl; 

    // 스택이 비었는지 확인
    if (!s.empty()) {
        cout << "스택은 비어있지 않습니다." << endl;
    }
    //스택크기확인
    cout << "현재 스택의 크기 : " << s.size() << endl; 

    //전체 스택 비우기
    while(!s.empty()){
        cout << "스택에서 꺼낸 값: " << s.top() << endl;
        s.pop();
    }


    return 0;
}