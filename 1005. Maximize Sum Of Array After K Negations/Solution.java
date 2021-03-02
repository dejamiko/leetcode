{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int largestSumAfterKNegations(int[] A, int K) \{\
        int neg=0;\
        Arrays.sort(A);\
        for(int i=0; i<A.length; ++i)\
            if(A[i]<0)\
                neg++;\
            else\
                break;\
        for(int i=0; i<Math.min(K, neg); ++i)\
            A[i]=-A[i];\
        K-=Math.min(K, neg);\
        K=K%2;\
        if(K>0)\
        \{\
            Arrays.sort(A);\
            A[0]=-A[0];\
        \}\
        int sum=0;\
        for(int i=0; i<A.length; ++i)\
            sum+=A[i];\
        return sum;\
    \}\
\}}