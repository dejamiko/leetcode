{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int findContentChildren(int[] g, int[] s) \{\
        int ans=0;\
        Arrays.sort(g);\
        Arrays.sort(s);\
        int i=0, j=0;\
        while(i<g.length && j<s.length)\
        \{\
            if(g[i]<=s[j])\
            \{\
                i++;\
                j++;\
                ans++;\
            \}\
            else\
                j++;\
        \}\
        return ans;\
    \}\
\}}