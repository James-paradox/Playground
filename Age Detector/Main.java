#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by,cy,a,b;
  cin>>by;
  cin>>cy;
  if(by<100 && by>0)
  {
    if(cy<100 && cy>=00)
    {
      if(by>cy)
      {
        a=(100-by) + cy;
        cout<<a;
      }
      else 
      {
        b= cy-by;
        cout<<b;
      }
    }
  }
    else
    {
      cout<<"Invalid input";
    }
}