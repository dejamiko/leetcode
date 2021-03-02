{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] searchRange(int[] nums, int target) \{\
        int[] ans=new int[]\{-1, -1\};\
        if(nums.length==0)\
            return ans;\
        int min=0, max=nums.length, mid=0;\
        while(min<max)\
        \{\
            mid=(max-min)/2+min;\
            if(nums[mid]==target)\
            \{\
                ans[0]=mid;\
                ans[1]=mid;\
                break;\
            \}\
            else if(nums[mid]<target)\
                min=mid+1;\
            else\
                max=mid;\
        \}\
        for(int i=mid; i>=0; --i)\
            if(target==nums[i])\
                ans[0]=i;\
            else\
                break;\
        \
        for(int i=mid; i<nums.length; ++i)\
            if(target==nums[i])\
                ans[1]=i;\
            else\
                break;\
        \
        return ans;\
    \}\
\}}