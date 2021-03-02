{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String addBinary(String a, String b) \{\
        StringBuilder ans=new StringBuilder("");\
        while(a.length()>b.length())\
            b='0'+b;\
        while(b.length()>a.length())\
            a='0'+a;\
        int carry=0;\
        for(int i=a.length()-1; i>=0; --i)\
        \{\
            int t=a.charAt(i)+b.charAt(i)-'0'-'0'+carry;\
            if(t>1)\
                carry=1;\
            else\
                carry=0;\
            ans.append((char)(t%2+'0'));\
        \}\
        if(carry==1)\
            ans.append('1');\
        return ans.reverse().toString();\
    \}\
\}}