#include<iostream>
using namespace std;
int main() {
  int x,y,Menu;
  cout<<"Enter first number :";
  cin>>x;
  cout<<" Enter second number :";
  cin>>y;
  cout<<" Menu"<<endl;
  cin>>Menu;
  cout<<"1.Addition"<<endl<<"2.Subtraction"<<endl<<"3.Multiplication"<<endl<<"4.Division"<<endl<<"5.Remainder"<<endl;
  switch(Menu) {
    case 1: cout<<x+y;
      break;
    case 2: cout<<x-y;
      break;
    case 3: cout<<x*y;
      break;
    case 4: cout<<x/y;
      break;
    case 5: cout<<x%y;
      break;
    default: cout<<"Invalid operation";
  }
}