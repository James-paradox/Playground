#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,l;
  cin>>r;
  cin>>l;
  int d=2*r;
  if(d<=l)
  {
    cout<<"circle can be inside a square";
  }
  else
  {
    cout<<"circle cannot be inside a square";
  }
}