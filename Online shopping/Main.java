#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,x,sn_a,snd,sns,y,a_a,ad,as,z;
  cin>>fa;
  cin>>fd;
  cin>>fs;
  cin>>sn_a;
  cin>>snd;
  cin>>sns;
  cin>>a_a;
  cin>>ad;
  cin>>as;
  float f_t,s_t,a_t;  
  f_t = (fd*fa)/100;  //flipkart
  x= (fa-f_t)+fs;
  cout<<"In Flipkart Rs."<<x<<endl;
  //Snapdeal
  s_t = (snd*sn_a)/100;
  y=(sn_a-s_t) +sns;
  cout<<"In Snapdeal Rs."<<y<<endl;
  //Amazon
  a_t = (ad*a_a)/100;
  z= (a_a-a_t) + as;
  cout<<"In Amazon Rs."<<z<<endl;
  if(x<=y && x<=z)
  {
    cout<<"He will prefer Flipkart";
  }
  else if(y<=z)
  {
    cout<<"He will prefer Snapdeal";
  }
  else 
  {
    cout<<"He will prefer Amazon";
  }
 }