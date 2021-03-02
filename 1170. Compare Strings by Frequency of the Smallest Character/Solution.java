{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] numSmallerByFrequency(String[] queries, String[] words) \{\
        int[] ans=new int[queries.length];\
        int[] freq=new int[words.length];\
        for(int i=0; i<words.length; ++i)\
        \{\
            char[] t=words[i].toCharArray();\
            Arrays.sort(t);\
            for(int j=0; j<t.length; ++j)\
                if(t[j]==t[0])\
                    freq[i]++;\
                else\
                    break;\
        \}\
        Arrays.sort(freq);\
        for(int i=0; i<queries.length; ++i)\
        \{\
            char[] t=queries[i].toCharArray();\
            Arrays.sort(t);\
            int temp=0;\
            for(int j=0; j<t.length; ++j)\
                if(t[j]==t[0])\
                    temp++;\
                else\
                    break;\
            for(int j=freq.length-1; j>=0; --j)\
                if(freq[j]>temp)\
                    ans[i]++;\
                else\
                    break;\
        \}\
        return ans;\
    \}\
\}}