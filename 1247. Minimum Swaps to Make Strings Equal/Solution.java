{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int minimumSwap(String s1, String s2) \{\
        if(s1.length()!=s2.length())\
            return -1;\
        int xmis=0, ymis=0;\
        for(int i=0; i<s1.length(); ++i)\
            if(s1.charAt(i)=='x' && s2.charAt(i)=='y')\
                xmis++;\
            else if(s1.charAt(i) == 'y' && s2.charAt(i) == 'x')\
                ymis++;\
        if(xmis%2!=ymis%2)\
            return -1;\
        int ans=xmis/2+ymis/2;\
        if(xmis%2==1)\
            ans+=2;       \
        return ans;\
    \}\
\}}