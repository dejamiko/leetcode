{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int maxSatisfied(int[] customers, int[] grumpy, int X) \{\
        int max=0, s=0;\
        for(int i=0; i<customers.length; ++i)\
            s+=customers[i]*((grumpy[i]+1)%2);\
        for(int i=0; i+X<=customers.length; ++i)\
        \{\
            int t=s;\
            for(int j=0; j<X; ++j)\
                if(grumpy[i+j]==1)\
                    t+=customers[i+j];\
            max=Math.max(max, t);\
        \}\
        return max;\
    \}\
\}}