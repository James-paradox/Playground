#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,sq,b=1,q,x,y;
  cin>>a;
  q=a;
  sq = a*a;
  while(q>0)
  {
    b=b*10;
    q=q/10;
  }
  x = sq/b;
  y = sq%b;
  if((x+y) == a)
  {
    cout<<"Kaprekar Number";
  }
  else
  {
    cout<<"Not a Kaprekar Number";
  }
}