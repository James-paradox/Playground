#include<iostream>
using namespace std;
int result(int*, int);
int main()
{
  //Type your code here.
  int n,s;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int arr[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0; i<n;i++)
  {
    cin>>arr[i];
  }
  s=result(arr,n);
  if(s==1)
  {
    cout<<"The array is Even\n";
  }
  else if(s==2)
  {
    cout<<"The array is Odd\n";
  }
  else
  {
    cout<<"The array is Mixed\n";
  }
  
}
int result(int *a,int x){
  int o=0,e=0;
  for(int i=0; i<x;i++)
  {
    if(a[i]%2==0)
    {
      e=e+1;
    }
    else
    {
      o=o+1;
    }
  }
  if(e>0 && o==0)
  {
    return 1;
  }
  else if(o>0 && e==0)
  {
    return 2;
  }
  else
  {
    return 3;
  }
}