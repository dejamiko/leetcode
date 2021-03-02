{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String interpret(String c) \{\
        String ans="";\
        for(int i=0; i<c.length(); ++i)\
        \{\
            if(c.charAt(i)=='G')\
                ans+='G';\
            else if(i+1<c.length() && c.charAt(i)=='(' && c.charAt(i+1)==')')\
            \{\
                ans+='o';\
                i++;\
            \}\
            else\
            \{\
                ans+="al";\
                i+=3;\
            \}\
        \}\
        return ans;\
    \}\
\}}