{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int fib(int N) \{\
        int[] temp=new int[N+1];\
        temp[0]=0;\
        if(N==0)\
            return 0;\
        temp[1]=1;\
        if(N<2)\
            return temp[N];\
        for(int i=2; i<N; ++i)\
            temp[i]=temp[i-1]+temp[i-2];\
        return temp[N-2]+temp[N-1];\
    \}\
\}}