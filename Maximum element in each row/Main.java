#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
	for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  int max;
  for(int i=0;i<m;i++)
  {
    max=a[i][0];
    for(int j=0; j<n;j++)
    {
      if(a[i][j] > max)
      {
        max=a[i][j];
      }
    }
      cout<<max<<endl;
  }
  
}