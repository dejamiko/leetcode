{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String longestCommonPrefix(String[] strs) \{\
        String ans="";\
        if(strs.length==0)\
            return ans;\
        if(strs.length==1)\
            return strs[0];\
        int l=strs[0].length();\
        for(int i=0; i<strs.length; ++i)\
            l=Math.min(l, strs[i].length());\
        while(l>0)\
        \{\
            boolean works=true;\
            ans=strs[0].substring(0, l);\
            for(int j=1; works && j<strs.length; ++j)\
                if(!strs[j].substring(0, l).equals(ans))\
                    works=false;\
            if(works)\
                return ans;\
            l--;\
        \}\
        return "";\
    \}\
\}}