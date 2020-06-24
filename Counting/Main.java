#include<iostream>
#include<string>
using namespace std;
int main(){
  string line;
  getline(cin,line);
  int v=0,c=0,d=0,w=0,s=0;
  for(int i =0;line[i]!='\0';i++) {
    if(line[i]=='a' || line[i]=='e' || line[i]=='i' ||
           line[i]=='o' || line[i]=='u' || line[i]=='A' ||
           line[i]=='E' || line[i]=='I' || line[i]=='O' ||
           line[i]=='U')
        {
            ++v;
        }
    else if((line[i]>='a' && line[i]<='z') || (line[i]>='A' && line[i]<='Z'))
    {
      ++c;
    }
    else if(line[i]>='0' && line[i]<='9')
    {
      ++d;
    }
    else if(line[i]==' ')
    {
      ++w;
    }
   else
    {
      ++s;
    }
  }
  cout<<"Vowels:"<<v<<endl;
  cout<<"Consonants:"<<c<<endl;
  cout<<"White Spaces:"<<w<<endl;
  cout<<"Digits:"<<d<<endl;
  cout<<"Symbols:"<<s<<endl;
return 0;
}