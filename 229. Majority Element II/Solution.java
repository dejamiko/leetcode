{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<Integer> majorityElement(int[] nums) \{\
        Arrays.sort(nums);\
        ArrayList<Integer> ans=new ArrayList();\
        if(nums.length==2)\
        \{\
            ans.add(nums[0]);\
            if(nums[0]!=nums[1])\
                ans.add(nums[1]);\
            return ans;\
        \}\
        for(int i=0; i+1<nums.length; ++i)\
        \{\
            int t=1;\
            boolean f=false;\
            while(i+1<nums.length && nums[i+1]==nums[i])\
            \{\
                i++;\
                t++;\
                f=true;\
            \}\
            if(f)\
                i--;\
            if(t>nums.length/3)\
                ans.add(nums[i]);\
        \}\
        if(nums.length==1)\
            ans.add(nums[0]);\
        return ans;\
    \}\
\}}