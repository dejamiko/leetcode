{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int numSplits(String s) \{\
        int ans=0;\
        char[] t=s.toCharArray();\
        int[] left=new int[26];\
        int[] right=new int[26];\
        int leftUn=1, rightUn=0;\
        left[t[0]-'a']++;\
        for(int i=1; i<t.length; ++i)\
        \{\
            right[t[i]-'a']++;\
            if(right[t[i]-'a']==1)\
                rightUn++;\
        \}\
        if(rightUn==leftUn)\
            ans++;\
        for(int i=1; i<t.length; ++i)\
        \{\
            right[t[i]-'a']--;\
            left[t[i]-'a']++;\
            if(right[t[i]-'a']==0)\
                rightUn--;\
            if(left[t[i]-'a']==1)\
                leftUn++;\
            if(leftUn==rightUn)\
                ans++;\
        \}\
        return ans;\
    \}\
\}}