{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int searchInsert(int[] nums, int target) \{\
        int min=0, max=nums.length, mid=0;\
        while(min<max)\
        \{\
            mid=(max-min)/2+min;\
            if(target==nums[mid])\
                return mid;\
            else if(target<nums[mid])\
                max=mid;\
            else\
                min=mid+1;\
            System.out.println(mid);\
        \}\
        if(mid-1>=0 && nums[mid-1]<target && nums[mid]>target)\
            return mid;\
        if(nums[mid]<target)\
            return mid+1;\
        return mid;\
    \}\
\}}