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
  for(int i=0;i<n;i++)
  {
    max=a[0][i];
    for(int j=0; j<m;j++)
    {
      if(a[j][i] > max)
      {
        max=a[j][i];
      }
    }
      cout<<max<<endl;
  }
  
}