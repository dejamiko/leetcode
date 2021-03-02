{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int findMinFibonacciNumbers(int k) \{\
        int[] fib; \
        if(k<8)\
            fib=new int[k+3];\
        else\
            fib=new int[45];\
        fib[0]=1;\
        fib[1]=1;\
        int ans=0, index=fib.length-1;\
        for(int i=2; i<fib.length; ++i)\
        \{\
            if(fib[i]>k)\
            \{\
                index=i;\
                break;\
            \}\
            fib[i]=fib[i-1]+fib[i-2];\
        \}\
        while(k>0)\
        \{\
            while(k-fib[index]>=0)\
            \{\
                k-=fib[index];\
                ans++;\
            \}\
            index--;\
        \}\
        return ans;\
    \}\
\}}