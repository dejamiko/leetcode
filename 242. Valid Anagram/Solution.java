{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean isAnagram(String s, String t) \{\
        if(s.length()!=t.length())\
            return false;\
        int[] sc=new int[260];\
        int[] tc=new int[260];\
        for(int i=0; i<s.length(); ++i)\
        \{\
            sc[s.charAt(i)]++;\
            tc[t.charAt(i)]++;\
        \}\
        for(int i=0; i<260; ++i)\
            if(sc[i]!=tc[i])\
                return false;\
        return true;\
    \}\
\}}