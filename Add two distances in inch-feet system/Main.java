#include<iostream>
using namespace std;
struct Dist{
  int i;
  float f;
};
Dist findsum(Dist d1, Dist d2);
int main()
{
  //Type your code here.
  Dist d1,d2,sum;
  cin>>d1.i>>d1.f;
  cin>>d2.i>>d2.f;
  sum=findsum(d1,d2);
  cout<<sum.i<<"'-"<<sum.f<<'"'<<endl;
  return 0;
}
Dist findsum(Dist d1, Dist d2) {
  Dist sum;
  sum.i=d1.i+d2.i;
  sum.f=d1.f+d2.f;
  if(sum.f>=12.0)
  {
    sum.i=sum.i+1;
    sum.f=sum.f-12;
  }
  return sum;
}
