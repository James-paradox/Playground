#include<iostream>
using namespace std;
int main() {
  int max, wt;
  cin>>max;
  cin>>wt;
  if(wt==max)
  {
    cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else if(wt<max)
  {
    cout<<"Yes, you can enter.";
  }
  else
    cout<<"Sorry, you can't enter";
}