#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rows,c,n;
  cin>>rows;
  cin>>c;
  cin>>n;
  if(n>=1 && n<=c)
  {
    cout<<"Yes";
  }
  else if(n>=1 && (n-1)%c==0 && (n-1)/c>=0)
  {
    cout<<"Yes";
  }
  else if(n>=c && (n-c)%c==0 && (n-c)/c>=0)
  {
    cout<<"Yes";
  }
 else 
 
   cout<<"No";
}
