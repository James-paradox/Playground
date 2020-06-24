#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y;
  cin>>w;
  cin>>x;
  cin>>y;
  int sp = w*x;
  int cp = (w*y)+100;
  int p = sp - cp;
  cout<<p;
}