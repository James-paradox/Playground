#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  int sum=0;
  cin>>n;
  for(int i=n-1;i>0;i--)
  {
    
    sum=sum+i;
  }
  cout<<sum;
}