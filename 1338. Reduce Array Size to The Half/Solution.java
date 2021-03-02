{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int minSetSize(int[] arr) \{\
        int[] t=new int[100002];\
        for(int i=0; i<arr.length; ++i)\
            t[arr[i]]++;\
        Arrays.sort(t);\
        int h=arr.length/2;\
        for(int i=100001; i>=0; --i)\
        \{\
            h-=t[i];\
            if(h<=0)\
                return 100001-i+1;\
        \}\
        return -1;\
    \}\
\}}