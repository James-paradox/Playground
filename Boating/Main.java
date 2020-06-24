#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int boat,a,c,wt_a,wt_c,total;
  cin>>boat;
  cin>>a;
  cin>>c;
  wt_a=a*75;
  wt_c=c*30;
  total = wt_a + wt_c;
  if(total<=boat){
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}