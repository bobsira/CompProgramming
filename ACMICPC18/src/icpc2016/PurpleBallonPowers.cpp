#include<bits/stdc++.h>
using namespace std;
int leastPrimeFactor(int n){
    vector<int> least_prime(n+1, 0);
    least_prime[1] = 1;
    for (int i = 2; i <= n; i++){
        if (least_prime[i] == 0){
            least_prime[i] = i;
            for (int j = 2*i; j <= n; j += i)
                if (least_prime[j] == 0)
                   least_prime[j] = i;
                 }
                 }
    return least_prime[n];
}
int checkPrimeNumber(int n){
  bool flag = false;
  for(int i = 2; i <= n/2; ++i){
      if(n%i == 0){
          flag = true;
          break;
      }
  }
  return flag;
}
int main(int argc, char const *argv[]) {
  int input;
  while (true) {
    cin >> input;
    if(input<0) break;
    if(!checkPrimeNumber(input)){
      cout <<input << "^" <<"1" << "\n";
    }
    else{
      int result = leastPrimeFactor(input);
      //std::cout << result << '\n';
      int counter=0;
      for (int i = 0; i < sqrt(input); i++) {
        int result1 = pow(result,i);
        if (result1 <input ) {
          counter++;
        }else{
          break;
        }
      }
      cout<< result << "^" << counter << "\n";
    }
  }
  return 0;
}
