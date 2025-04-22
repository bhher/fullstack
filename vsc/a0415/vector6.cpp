#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};
    auto it = cars.begin()+2; //인텍스 2번위치(3번째)에 삽입
    cars.insert(it, "Hyundai");

    for(string car:cars){
      cout << car << "\n"; 
    }
      
    return 0;
}