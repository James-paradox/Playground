#include<iostream>
using namespace std;
int gcd(int,int,int,int);
int main(){
  int n1,n2,n3,answer,small;
  cin>>n1;
  cin>>n2;
  cin>>n3;
  cin>>answer;
  if(n1<n2 && n1<n3)
  {
    small = n1;
  }
  else if(n2<n3)
  {
    small = n2;
  }
  else
  {
    small = n3;
  }
  int s = gcd(n1,n2,n3,small);
  if(s==answer)
  {
    cout<<"Answer is correct.";
  }
  else
    cout<<"Answer is wrong.";
}
int gcd(int x, int y ,int z, int a)
{
int div;
  while(a>=1)
  {
    if(x%a==0 && y%a==0 && z%a==0)
    {
      div = a;
      break;
    }
    a--;
  }
  return div;
}