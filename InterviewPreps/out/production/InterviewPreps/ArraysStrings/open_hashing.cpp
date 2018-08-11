#include <iostream>
#include<bits/stdc++.h>

/* Assumption
   Hash function will return an integer from 0 to 19*/
std::vector<std::string> hashTable[20];
int hashTableSize = 20;

int hashFunc( std::string key ){
  /*Convert string key to an int index*/
}

void insert(std::string s) {
  /* compute the index using Hash Function*/
  int index = hashFunc(s);
  /* Insert the element in the linked list at the particular index*/
  hashTable[index].push_back(s);
}

void search(std::string s) {
  /* compute the index by using the hash function */
  int index = hashFunc(s);
  /* search the linked list at that specific index*/
  for (int i = 0; i < hashTable[index].size(); i++) {
    if (hashTable[index][i] == s ) {
      std::cout << s << " is found! " << '\n';
      return;
    }
  }
  std::cout << s  << " is not found! "<< '\n';
}
