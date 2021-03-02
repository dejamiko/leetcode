{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String addStrings(String num1, String num2) \{\
        StringBuilder ans=new StringBuilder("");\
        while(num1.length()>num2.length())\
            num2='0'+num2;\
        while(num2.length()>num1.length())\
            num1='0'+num1;\
        int carry=0;\
        for(int i=num1.length()-1; i>=0; --i)\
        \{\
            int t=num1.charAt(i)+num2.charAt(i)-'0'+carry;\
            if(t>'9')\
            \{\
                carry=1;\
                t-=10;\
            \}\
            else\
                carry=0;\
            ans.append((char)t);\
        \}\
        if(carry>0)\
            ans.append('1');\
        return ans.reverse().toString();\
    \}\
\}}