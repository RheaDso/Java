class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int>lookUp;
        vector<int> ans;
        for(int i=0; i<nums.size(); i++){
            int complement = target - nums[i];
            if(lookUp.find(complement) != lookUp.end()){
                ans.push_back(lookUp[complement]);
                ans.push_back(i);
                break;
            }
            else{
                lookUp.insert(make_pair(nums[i], i));
            }
        }
        return ans;
    }
};