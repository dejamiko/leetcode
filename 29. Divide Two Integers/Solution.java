{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int divide(int dividend, int divisor) \{\
        long ans=0, a, b;\
        boolean minus=false;\
        if(dividend<0 && divisor>0 || dividend>0 && divisor<0)\
            minus=true;\
        if(divisor==-1 && dividend==-2147483648)\
            return 2147483647; //error in test cases\
        b=Math.abs((long)dividend);\
        a=Math.abs((long)divisor);\
        if(a==1)\
        \{\
            if(minus)\
                return (int)-b;\
            return (int)b;\
        \}\
        while(b>=a)\
        \{\
            ans++;\
            b-=a;\
        \}\
        if(minus)\
            return (int)-ans;\
        return (int)ans;\
    \}\
\}}