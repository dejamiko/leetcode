{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String[] findRelativeRanks(int[] nums) \{\
        String[] ans=new String[nums.length];\
        for(int j=0; j<nums.length; ++j)\
        \{\
            int max=0;\
            for(int i=0; i<nums.length; ++i)\
                max=Math.max(max, nums[i]);\
            for(int i=0; i<nums.length; ++i)\
                if(nums[i]==max)\
                \{\
                    if(j==0)\
                        ans[i]="Gold Medal";\
                    else if(j==1)\
                        ans[i]="Silver Medal";\
                    else if(j==2)\
                        ans[i]="Bronze Medal";\
                    else\
                        ans[i]=String.valueOf(j+1);\
                    nums[i]=-1;\
                \}\
        \}\
        return ans;\
    \}\
\}}