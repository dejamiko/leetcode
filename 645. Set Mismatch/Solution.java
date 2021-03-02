{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] findErrorNums(int[] nums) \{\
        int[] ans=new int[2];\
        for(int i=0; i<nums.length; ++i)\
            nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];\
        boolean found=false;\
        for(int i=0; i<nums.length; ++i)\
            if(nums[i]>0)\
                if(found)\
                    ans[1]=i+1;\
                else\
                \{\
                    ans[0]=i+1;\
                    found=true;\
                \}\
        for(int i=0; i<nums.length; ++i)\
            if(Math.abs(nums[i])==ans[0])\
                return ans;\
        int t=ans[0];\
        ans[0]=ans[1];\
        ans[1]=t;\
        return ans;\
    \}\
\}}