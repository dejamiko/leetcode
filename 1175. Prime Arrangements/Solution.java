{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int numPrimeArrangements(int n) \{\
        int p=0;\
        for(int i=2; i<=n; ++i)\
        \{\
            boolean prime=true;\
            for(int j=2; prime && j*j<=i; ++j)\
                if(i%j==0)\
                    prime=false;\
            if(prime)\
                p++;\
        \}\
        long ans=1;\
        for(int i=2; i<=p; ++i)\
            ans=ans*i%1000000007;\
        for(int i=1; i<=n-p; ++i)\
            ans=ans*i%1000000007;\
        return (int)ans;\
    \}\
\}}