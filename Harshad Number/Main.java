#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,n ,sum =0;
  cin>>n;
  int temp =n;
  while(n!=0)
  {
    a=n%10;
    
    n=n/10;
    sum=sum+a;
  }
  if(temp%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
}
