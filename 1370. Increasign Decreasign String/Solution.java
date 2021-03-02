{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String sortString(String s) \{\
        StringBuilder ans=new StringBuilder();\
        int len=s.length();\
        char[] temp=new char[26];\
        for(int i=0; i<len; ++i)\
            temp[s.charAt(i)-'a']++;\
        while(len>0)\
        \{\
            for(int i=0; i<26; ++i)\
                if(temp[i]>0)\
                \{\
                    ans.append((char)(i+'a'));\
                    temp[i]--;\
                    len--;\
                \}\
            for(int i=25; i>=0; --i)\
                if(temp[i]>0)\
                \{\
                    ans.append((char)(i+'a'));\
                    temp[i]--;\
                    len--;\
                \}\
        \}\
        return ans.toString();\
    \}\
\}}