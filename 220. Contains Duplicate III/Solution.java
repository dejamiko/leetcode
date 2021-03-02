{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) \{\
        int[][] b=new int[nums.length][2];\
        for(int i=0; i<nums.length; ++i)\
        \{\
            b[i][0]=nums[i];\
            b[i][1]=i;\
        \}\
        Arrays.sort(b, Comparator.comparingInt(o -> o[0]));\
        for(int i=0; i<nums.length; ++i)\
        \{\
            for(int j=i+1; j<nums.length; ++j)\
                if((long)b[j][0]-(long)b[i][0]>t)\
                    break;\
                else\
                    if(Math.abs(b[j][1]-b[i][1])<=k)\
                        return true;\
        \}\
        return false;\
    \}\
\}}