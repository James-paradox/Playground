#include<iostream>
using namespace std;
int gcd(int x,int y, int z)
{
  if(y==1)
  {
    return 1;
  }
  if(x%y==0 && z%y==0)
  {
    return y;
  }
  
  return gcd(x,y-1,z);
}
int main()
{
  //Type your code here.
  int a,b,s,l;
  cin>>a;
  cin>>b;
  if(a<b)
  {
    s=a;
    l=b;
  }
  else{
    s=b;
    l=a;
  }
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(l,s,s);
}
