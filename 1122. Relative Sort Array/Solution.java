{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] relativeSortArray(int[] arr1, int[] arr2) \{\
        int[] ans=new int[arr1.length];\
        int c=0;\
        for(int i=0; i<arr2.length; ++i)\
            for(int j=0; j<arr1.length; ++j)\
                if(arr1[j]==arr2[i])\
                \{\
                    ans[c++]=arr1[j];\
                    arr1[j]=-1;\
                \}\
        Arrays.sort(arr1);\
        for(int j=0; j<arr1.length; ++j)\
            if(arr1[j]!=-1)\
                ans[c++]=arr1[j];\
        return ans;\
    \}\
\}}