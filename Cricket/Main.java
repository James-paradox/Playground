#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int balls, runs, r_s, nos_bowled, x;
  float t_o, over, crr, y,rr;
  cin>>balls;
  cin>>runs;
  cin>>r_s;
  cin>>nos_bowled;
  over = balls/6;
  cout<<over<<endl;
  x = nos_bowled/6;
  y = (float)(nos_bowled%6)/10;
  t_o = x+y;
  cout<<t_o<<endl;
  crr = (float)r_s/t_o;
  float v =crr,r1,r2;
  r1 = (int)(v*10 + 0.5);
  r2 = (r1/100)*10;
  cout<<r2<<endl;
  rr= runs/over;
  float w = rr,a,b;
  a=(int)(w*10 + 0.5);
  b=(a/100)*10;
  cout<<b<<endl;
  if(r2>b)
  {
    cout<<"Eligible to Win";
  }
  else
  {
    cout<<"Not Eligible to Win";
  }
}