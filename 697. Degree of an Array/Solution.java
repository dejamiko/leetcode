{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int findShortestSubArray(int[] nums) \{\
        int[] t=new int[50000];\
        for(int i=0; i<nums.length; ++i)\
            t[nums[i]]++;\
        int max=0;\
        for(int i=0; i<50000; ++i)\
            if(max<t[i])\
            \{\
                max=t[i];\
            \}\
        ArrayList<Integer> possible=new ArrayList();\
        for(int i=0; i<50000; ++i)\
            if(max==t[i])\
                possible.add(i);\
        int min=nums.length;\
        for(int j=0; j<possible.size(); ++j)\
        \{\
            int maxind=possible.get(j), i=0, ans=0, c=max;\
            while(nums[i]!=maxind)\
                i++;\
            for(; c>0 && i<nums.length; ++i)\
            \{\
                if(nums[i]==maxind)\
                    c--;\
                ans++;\
            \}\
            min=Math.min(ans, min);\
        \}\
        return min;\
    \}\
\}}