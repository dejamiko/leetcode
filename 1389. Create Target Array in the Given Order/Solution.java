{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] createTargetArray(int[] nums, int[] index) \{\
        int[] ans=new int[nums.length];\
        for(int i=0; i<nums.length; ++i)\
            if(index[i]==i)\
                ans[i]=nums[i];\
            else\
            \{\
                int j=index[i];\
                int t;\
                for(int k=0; k<i-j; ++k)\
                \{\
                    t=ans[i-k];\
                    ans[i-k]=ans[i-k-1];\
                    ans[i-k-1]=t;\
                \}\
                ans[j]=nums[i];\
            \}\
        return ans;\
    \}\
\}}