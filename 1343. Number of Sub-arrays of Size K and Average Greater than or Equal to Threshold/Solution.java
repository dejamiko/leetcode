{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int numOfSubarrays(int[] arr, int k, int threshold) \{\
        int currsum=0, ans=0;\
        threshold*=k;\
        for(int i=0; i<k; ++i)\
            currsum+=arr[i];\
        if(currsum>=threshold)\
            ans++;\
        for(int j=0; j+k<arr.length; ++j)\
        \{\
            currsum-=arr[j];\
            currsum+=arr[j+k];\
            if(currsum>=threshold)\
                ans++;\
        \}\
        return ans;\
    \}\
\}}