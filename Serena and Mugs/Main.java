#include<iostream>
using namespace std;
int printresult(int*, int,int);
int main()
{
int n,s;
  cin>>n>>s;
  int arr[n];
  for(int i=0;i<n;i++)
  {
	cin>>arr[i];
  }
  printresult(arr,n,s);
}
int printresult(int *a, int x, int y)
{
  int sum=0;
  for(int i=0;i<x;i++)
  {
    sum=sum+a[i];
  }
  if(sum<=y)
  {
    cout<<"YES";
  }
  else
    cout<<"NO";
}