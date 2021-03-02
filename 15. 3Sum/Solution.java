{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<List<Integer>> threeSum(int[] nums) \{\
        ArrayList<List<Integer>> ans=new ArrayList();\
        if(nums.length<3)\
            return ans;\
        Arrays.sort(nums);\
        for (int i = 0;i<nums.length; i++)\{\
            if (i-1 >= 0 && nums[i] == nums[i-1])\
                continue;\
                \
            int left = i+1;\
            int right  = nums.length-1;\
            \
            while (left < right)\{\
                int sum = nums[i] + nums[left] + nums[right];\
                if (sum == 0)\{\
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));\
                    while (left + 1 < right && nums[left] == nums[left+1])\
                        left++;\
                    while (left < right-1 && nums[right] == nums[right-1])\
                        right--;\
                    left++;\
                    right--;    \
                \}\
                else if (sum < 0)\{\
                    left++;\
                \} else \{\
                    right--;\
                \}    \
            \}\
        \}\
        return ans;\
    \}\
\}}