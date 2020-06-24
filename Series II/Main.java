#include<iostream>
using namespace std;
int main()
{
  int a,n,x;
  cin>>n;
  a=11;
  for(int i =0;i<n;i++)
  {
	x=(a+4*i)*(a+4*i);
  	cout<<x<<" ";
  }
}