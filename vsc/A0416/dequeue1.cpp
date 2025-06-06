#include <iostream>
#include <deque>
using namespace std;
int main(){
   deque<int> dq;
   
   dq.push_back(10); //뒤에추가
   dq.push_back(20); //뒤에추가
   dq.push_front(5); //앞에 추가
   cout << "앞쪽 값 : " << dq.front() << endl; //5출력
   cout << "뒤쪽 값 : " << dq.back() << endl; //20출력 
    
   //앞뒤의 데이터 제거
  dq.pop_front(); //5제거
  dq.pop_back();      // 20 삭제
  cout << "삭제후 앞쪽 값 : " << dq.front() << endl; //10출력

  // 큐 크기 확인
  dq.push_back(30);
  dq.push_front(1);

  cout << " 현재 데큐 요소들:";
  for(int num : dq){
    cout << num << " ";
  }
  cout << endl;
  
    return 0;
}


// push_back()	뒤에 삽입
// push_front()	앞에 삽입
// pop_back()	뒤에서 제거
// pop_front()	앞에서 제거
// front()	앞쪽 요소 확인
// back()	뒤쪽 요소 확인
// size()	크기 확인
// empty()	비어있는지 확인
