#pragma once
#include <iostream>
#include <string>
#include <fstream>
#include <vector>
using namespace std;

class BST_Node
{
    public:
        BST_Node();
        BST_Node(string name, string address, int accountno, int password, int balance);
        ~BST_Node();
        string name;
        string address;
        int account_number;
        int password;
        int balance;
        BST_Node* left;
        BST_Node* right;
};
