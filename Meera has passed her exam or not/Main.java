#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for(int i =0; i<n;i++)
  {
	cin>>a[i];
  }
  int r,s;
  cin>>r;
  for(int i=0; i<n;i++)
  {
    if(r==a[i])
    {
		s=a[i];
      break;
    }
  }
  if(r==s)
    {
      cout<<"She passed her exam";
    }
    else
    {
      cout<<"She failed";
    	
    }
  
}