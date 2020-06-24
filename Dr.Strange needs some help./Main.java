#include<iostream>
using namespace std;
int multiply(int,int);
int main()
{
  int m,n,req;
  cin>>m;
  cin>>n;
  cin>>req;
  int s= multiply(m,n);
  if(s>=req)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
int multiply(int x, int y)
{
  int z =1;
  for(int i =1; i<=y; i++)
  {
    z = z*x;
  }
  return z;
}