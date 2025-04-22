#include <iostream>
#include <string>
using namespace std;

int main (){
    string myString = "Hello";
    cout << myString <<"\n";
    cout << myString.at(0) <<"\n"; //첫번째문자
    cout << myString.at(1) <<"\n"; //두번째문자
    cout << myString.at(myString.length() - 1);// //마지막 문자
    myString.at(0) = 'J';
    cout << myString <<"\n";
    return 0;
}