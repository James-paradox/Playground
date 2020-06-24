#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,n;
  cin>>x;
  cin>>y;
  cin>>n;
  if(n>=x+1 && n<=x+y)
  {
    cout<<"It is a mango tree";
  }
  else if(n>(y-2)*x && n<=(y-1)*x)
  {
    cout<<"It is a mango tree";
  }
  else
    cout<<"It is not a mango tree";
}