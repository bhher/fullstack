#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};

    // Print vector elements
    for (string car : cars) {
      cout << car << "\n";
    }
    return 0;
}