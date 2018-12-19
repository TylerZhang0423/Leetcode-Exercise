#include <iostream>
#include <vector>
#include <cstdarg>
#include <string>
using namespace std;

class Solution{
public:
	vector<int> twoSum(vector<int> &nums,int target){
		int vector_size,i,j;
		vector<int> result;
		vector_size=nums.size();
		for(i=0;i<=vector_size-1;++i){
			for(j=i+1;j<=vector_size-1;++j){
				if (nums[i]+nums[j]==target && i!=j){
					result.push_back(i);
					result.push_back(j);
				}
			}
		}
		return result;
	}
};

int main()
{
    /* code */
    cout<<"test"<<endl;
    return 0;
}
