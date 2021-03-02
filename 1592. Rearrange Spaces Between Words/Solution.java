{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String reorderSpaces(String text) \{\
        int count=0, size=0;\
        for(int i=0; i<text.length(); ++i)\
            if(text.charAt(i)==' ')\
                count++;\
        String[] s=text.split("[ *]");\
        for(int i=0; i<s.length; ++i)   \
        \{\
            s[i]=s[i].trim();\
            if(s[i].length()>0)\
                size++;\
        \}\
        StringBuilder sb=new StringBuilder();\
        text=text.replaceAll(" ", "");\
        int t;\
        if(size-1!=0)\
            t=count/(size-1);\
        else\
            t=0;\
        for(int i=0; i<s.length; ++i)   \
        \{\
            sb.append(s[i]);\
            if(s[i].length()>0)\
                for(int j=0; count>0 && j<t; ++j)\
                \{\
                    sb.append(" ");\
                    count--;\
                \}\
        \}\
        while(count>0)\
        \{\
            sb.append(" ");\
            count--;\
        \}\
        return sb.toString();\
    \}\
\}}