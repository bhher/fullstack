#include <iostream>
#include <map>
using namespace std;
int main(){
    //map 선언
   map<string, int> score;
   
   // 값 삽입
   score["Alice"] = 95;
   score["Bob"] = 82;
   score["Charlie"] = 88;

   //출력
   cout << "학생 점수 목록: " << endl;
//    for(map<string, int>::iterator it=score.begin(); it!= score.end();++it){
//     cout << it -> first << " : " << it -> second << endl;
//    }

   for(auto it=score.begin(); it != score.end();++it){
    cout << it -> first << " : " << it -> second << endl;
   }
 //it -> first 키
 //it -> second 값
// 특정값 찾기
string name = "Bob";
if(score.find(name) != score.end()){
    cout << name << "의 점수는 " << score[name] << "점 입니다." << endl;
   }else{
    cout << name  << "의 점수가 존재하지 않습니다." << endl;
   }

//삭제 
score.erase("Charlie");
cout << "삭제후 남은 학생 목록"  << endl;

// for(auto it=score.begin(); it != score.end();++it){
//     cout << it -> first << " : " << it -> second << endl;
//    }
for(const auto& pair : score){
    cout << pair.first << " : " << pair.second << endl;
}
//const auto& pair : score  - score라는 map의 각 key-value 쌍을 pair 라는 이름으로 하나씩 가져옴
//:score - score 대상으로 순회 하겠다.
// pair.first   - 현재 순회중인 key
//pair.second - 현재 순회중인 value
    return 0;
}


//insert() 원소 삽입(중복 불허)
//find() 찾기 (반환값 == end() 이면 없음)
//erase() 특정원소 삭제
//size() 크기
//empty()	비어있는지 확인
//clear() 모두삭제
