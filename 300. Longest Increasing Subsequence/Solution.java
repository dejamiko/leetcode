{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int lengthOfLIS(int[] nums) \{\
        if(nums.length==0)\
            return 0;\
        int[] d=new int[nums.length];\
        int ans=1;\
        d[0]=1;\
        for(int i=1; i<nums.length; ++i)\
        \{\
            int max=0;\
            for(int j=0; j<i; ++j)\
                if(nums[i]>nums[j])\
                    max=Math.max(max, d[j]);\
            d[i]=max+1;\
            ans=Math.max(ans, d[i]);\
        \}\
        return ans;\
    \}\
\}}