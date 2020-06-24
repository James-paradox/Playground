#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
   int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];//cout<<" ";
  }
  int h =a[0];
  for(int i=0; i<n;i++)
  {
	if(h<a[i])
    {
      h=a[i];
    }
    else
    {
		h=h;
    }
  }
  cout<<h;
}
