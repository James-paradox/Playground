#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int *a;
  int n,m=0,f=0;
  cin>>n;
  a = (int *)malloc(n*sizeof(int));
  for(int i =0; i<n;i++)
  {
    cin>>*(a+i);
  }
  for(int i =0;i<n;i++)
  {
    if((*(a+i))%2==0)
    {
      f=f+1;
    }
    else
    {
      m=m+1;
    }
  }
  cout<<m<<endl;
  cout<<f<<endl;

  
  return 0;
}