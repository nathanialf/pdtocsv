#include <fstream>
#include <iostream>
#include <string>
#include <vector>

#define FIELDCOUNT 106

using namespace std;

vector<string> split (string s, char delim);

int main()
{
  string str;

  string data [106];

  char delim = ':';
  
  //Opens for reading the file
  ifstream b_file ( "../CrimScripts/Text files/80-14-061705.txt" );
  //Reads one string from the file
  while(getline(b_file, str))
  {
    cout << str << endl;
    vector<string> items = split(str, delim);
    if(items.size() > 1){
      for(int i = 0; i < items.size(); i++){
	cout << items[i] << "::";
      }
      cout << endl;
    }
  }
  cin.get();    // wait for a keypress
  // b_file is closed implicitly here
}

vector<string> split(string s, char delim) {
    stringstream ss(s);
    string item;
    vector<string> tokens;
    while (getline(ss, item, delim)) {
        tokens.push_back(item);
    }
    return tokens;
}
