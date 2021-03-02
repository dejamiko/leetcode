{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean checkIfCanBreak(String s1, String s2) \{\
        char[] c1=s1.toCharArray();\
        char[] c2=s2.toCharArray();\
        Arrays.sort(c1);\
        Arrays.sort(c2);\
        boolean go1=true, go2=true;\
        for(int i=0; go1 && i<c1.length; ++i)\
            if(c1[i]<c2[i])\
                go1=false;\
        if(go1)\
            return true;\
        for(int i=0; go2 && i<c1.length; ++i)\
            if(c1[i]>c2[i])\
                go2=false;\
        return go1 || go2;\
    \}\
\}}