{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String gcdOfStrings(String str1, String str2) \{\
        String ans="";\
        String t=str1.substring(0, gcd(str1.length(), str2.length()));\
        for(int i=0; i<str1.length(); ++i)\
            if(str1.charAt(i)!=t.charAt(i%t.length()))\
                return ans;\
        for(int i=0; i<str2.length(); ++i)\
            if(str2.charAt(i)!=t.charAt(i%t.length()))\
                return ans;\
        return t;\
    \}\
    \
    private int gcd(int a, int b)\
    \{\
        if(a%b==0)\
            return b;\
        else\
            return gcd(b, a%b);\
    \}\
\}}