#include <iostream>
#include <queue>
using namespace std;
int main(){
   queue<int> q;
   //FIFO(FIRST IN FIRST OUT)
   //큐에 데이터 추가(push)
   q.push(10);
   q.push(20);
   q.push(30);
   cout << "현재 스택의 맨앞의 값 : " << q.front() << endl; //10
   cout << "현재 스택의 맨뒤의 값 : " << q.back() << endl; //30
    
   //큐의 데이터 제거

    q.pop(); 
    cout << "pop이후의 맨앞의 값 : " << q.front() << endl; //20출력

  // 큐 크기 확인
  cout << "현재 큐 크기: " << q.size() << endl;

  // 큐 비우기
  while (!q.empty()) {
      cout << "큐에서 꺼낸 값: " << q.front() << endl;
      q.pop();
  }


    return 0;
}
//push() ->  큐에 데이터 추가(뒤쪽으로 삽입)
//pop -> 큐에 데이터 제거(앞쪽 요소삭제)
//front() → 맨 앞 요소 확인
//back() → 맨 뒤 요소 확인
//empty() -> 큐이 비었는지 확인
//size() -> 현재 큐 크기 확인
