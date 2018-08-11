#include <bits/stdc++.h>
using namespace std;

int main(){
  string line;
  while(getline(cin, line)){
    if(line == "-1"){
      return 0;
    }
    int n,m; //topping,pizza
    istringstream iss(line);
    if (!(iss >> n >> m)) { break; } // error
    for(int i = 0; i < n; i++){
      int v;
      string topping;
      cin >> v >> topping;

    }
    for(int i = 0; i < m; i++){
      int p,t; //price , no.of topping
      cin >>p >> t;
      for(int j = 0; j < t; j++){
        string toppingName; cin >> toppingName;
      }
    }
    int u;
    cin >> u;
    for(int i = 0; i < u; i++){
      string name;cin >> name;
    }



  }
  return 0;

}