{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 \
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 class Solution \{\
    public int countSubstrings(String s) \{\
        int ans=s.length();\
        for(int i=2; i<=s.length(); ++i)\
            for(int k=0; k+i<=s.length(); ++k)\
            \{\
                boolean pal=true;\
                for(int j=0; j<i/2 && pal; ++j)\
                    if(s.charAt(j+k)!=s.charAt(k+i-j-1))\
                        pal=false;\
                if(pal)\
                    ans++;\
            \}\
        return ans;\
    \}\
\}}