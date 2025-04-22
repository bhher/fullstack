#include<iostream>
#include<list>
using namespace std;
int main(){
    list<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};

    // Print vector elements
    for (string car : cars) {
      cout << car << "\n";
    }
    return 0;
}