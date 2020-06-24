#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a=11,n,x;
  cin>>n;
  for(int i = 0; i<n;i++)
  {
    x=(a+4*i)*(a+4*i);
    cout<<x<<" ";
  }
}