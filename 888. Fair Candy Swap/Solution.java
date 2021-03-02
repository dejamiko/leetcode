{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] fairCandySwap(int[] A, int[] B) \{\
        int suma=0, sumb=0;\
        for(int i=0; i<A.length; ++i)\
            suma+=A[i];\
        for(int i=0; i<B.length; ++i)\
            sumb+=B[i];\
        for(int i=0; i<A.length; ++i)\
            for(int j=0; j<B.length; ++j)\
                if(suma-A[i]+B[j]==sumb-B[j]+A[i])\
                    return new int[]\{A[i], B[j]\};\
        return new int[]\{0, 0\};\
    \}\
\}}