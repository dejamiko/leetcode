{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int removeDuplicates(int[] nums) \{\
        int d=0;\
        for(int i=0; i+1<nums.length; ++i)\
        \{\
            int j=i+1;\
            while(j<nums.length && nums[i]==nums[j])\
            \{\
                nums[j]=-100000;\
                j++;\
                d++;\
            \}\
            i=j-1;\
        \}\
        int c=nums.length;\
        for(int i=0; c>=0 && i<nums.length; ++i)\
            if(nums[i]==-100000)\
            \{\
                for(int j=i; j+1<nums.length; ++j)\
                    nums[j]=nums[j+1];\
                i--;\
                c--;\
            \}\
        return nums.length-d;\
    \}\
\}}