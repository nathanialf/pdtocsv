#include <fstream>
#include <iostream>
#include <string>

using namespace std;

int main()
{
  string str;

  //Creates an instance of ofstream, and opens example.txt
  //ofstream a_file ( "../CrimScripts/'Text files'/80-14-061705.txt" );
  // Outputs to example.txt through a_file
  //a_file<<"This text will now be inside of example.txt";
  // Close the file stream explicitly
  //a_file.close();

  //Opens for reading the file
  ifstream b_file ( "../CrimScripts/Text files/80-14-061705.txt" );
  //Reads one string from the file
  while(getline(b_file, str))
  {
    cout << str << endl;
  }
  cin.get();    // wait for a keypress
  // b_file is closed implicitly here
}
