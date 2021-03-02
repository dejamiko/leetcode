{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] closestDivisors(int num) \{\
        int min=Integer.MAX_VALUE;\
        int[] ans=new int[2];\
        for(int i=(int)Math.ceil(Math.sqrt(num+1)); i>=1; --i)\
            if((double)(num+1)/(double)i==(num+1)/i)\
            \{\
                min=(num+1)/i-i;\
                ans[0]=(num+1)/i;\
                ans[1]=i;\
                break;\
            \}\
        for(int i=(int)Math.ceil(Math.sqrt(num+2)); i>=1; --i)\
            if((double)(num+2)/(double)i==(num+2)/i)\
            \{\
                if(min>(num+2)/i-i)\
                \{\
                    ans[0]=(num+2)/i;\
                    ans[1]=i;\
                \}\
                break;\
            \}\
        return ans;\
    \}\
\}}