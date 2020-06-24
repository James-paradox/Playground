#include <iostream>
using namespace std;


int main()
{
  float first;
  float second;
  cin >> first;
   cin >> second;

  
  for (int i = first; i <= second; i++)
  {
    int j = 0;
  int sum = 0;

  while (j++ < i)
  {
    if (i % j == 0 && j < i)
    {
      sum += j;
    }
  }
 
    
    if (sum == i)
    {
      cout << i << " ";
    }
  }

  return 0;
}
