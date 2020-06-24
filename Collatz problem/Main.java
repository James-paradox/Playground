#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b=0;
  cin>>a;
  cout<<a<<endl;
  while(a!=1) {
    if(a%2==0)
    {
      a=a/2;
      cout<<a<<endl;
    }
    else if(a%2!=0)
    {
      a=(3*a)+1;
      cout<<a<<endl;
    }
  b++;
}
  cout<<b;
}