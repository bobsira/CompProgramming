#include <iostream>
#include <string>

int Frequency[26];

int hashFunc( char c ){
  return ( c - 'a');
}
int main(int argc, char const *argv[]) {
  /* code */
countFre();
  return 0;
}

void countFre() {
  string S = "ababcd";
  for (char c = 'a';  c <= 'z'; ++ c) {
    int frequency = 0;
    for(int i = 0; i < S.length(); ++i)
      if(S[i] == c)
        frequency++;
    std::cout << c << ' ' << '\n';
  }
}

void countFre1(string S) {
  for (int i = 0; i < S.length(); ++i) {
    int index = hashFunc(S[i]);
    Frequency[index]++;
  }
  for (int i = 0; i < 26; ++i) {
    std::cout << (char)(i+'a') << ' ' << Frequency[i] << '\n';
  }
}
