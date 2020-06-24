#include<iostream>
using namespace std;
int main()
{
  int e_n,n,sum=0;
  cin>>e_n;
  cin>>n;
  int i=1, t=e_n + n;
  int z=t;
  while(i<t){
    if(t%i==0)
    {
      sum=sum+i;
      //i++;
    }
    i++;
  }
    if(sum==z)
    {
      cout<<"They can read the message"<<endl;
    }
    else
    {
      cout<<"They can't read the message"<<endl;
    }
  }