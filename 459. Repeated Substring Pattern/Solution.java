{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean repeatedSubstringPattern(String s) \{\
        for(int i=1; i<=s.length()/2; ++i)\
            if(s.length()%i==0)\
            \{\
                String t=s.substring(0, i);\
                boolean works=true;\
                for(int j=i; j<s.length(); j+=i)\
                    if(!s.substring(j, j+i).equals(t))\
                    \{\
                        works=false;\
                        break;\
                    \}\
                if(works)\
                    return true;\
            \}\
        return false;\
    \}\
\}}