{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String findLongestWord(String s, List<String> d) \{\
        Collections.sort(d);\
        Collections.sort(d, Comparator.comparingInt(o -> -o.length()));\
        char[] t=s.toCharArray();\
        for(int i=0; i<d.size(); ++i)\
        \{\
            int j=0, k=0;\
            char[] b=d.get(i).toCharArray();\
            while(j<t.length && k<b.length)\
            \{\
                if(t[j]==b[k])\
                \{\
                    j++;\
                    k++;\
                \}\
                else\
                    j++;\
            \}\
            if(k==b.length)\
                return d.get(i);\
        \}\
        return "";   \
    \}\
\}}