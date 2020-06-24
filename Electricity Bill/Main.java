#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit,total;
  cin>>unit;
  if(unit<=200){
    total = unit*0.5;
    cout<<"Rs."<<total;
  }
  else if(unit>200 && unit<=400) {
    total = (unit*0.65) + 100;
    cout<<"Rs."<<total;
  }
  else if(unit>400 && unit<=600) {
    total = (unit*0.80) + 200;
    cout<<"Rs."<<total;
  }
  else if(unit>600) {
  total = (unit*1.25) + 425;
    cout<<"Rs."<<total;
  }
  else 
    cout<<"Invalid input";
}