#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,d2,c1,c2;
  cin>>d1;
  cin>>c1;
  cin>>d2;
  cin>>c2;
    int t=d1+d2;
  	int c=c1+c2;
  if(c>=100)
  {
    t=t+1;
    c=c-100;
}
  cout<<t<<endl;
  cout<<c;
}