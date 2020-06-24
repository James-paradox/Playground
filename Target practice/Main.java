#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a,i=0,c=0,s=0;
  cin>>n;
  while(s<n)
  {
    c++;
    cin>>a;
    s=s+a;
    i++;
  }
  cout<<"The number of turns is "<<c;
  return 0;
  
}