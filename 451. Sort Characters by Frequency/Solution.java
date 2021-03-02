{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String frequencySort(String s) \{\
        char[] ans=new char[s.length()];\
        int[] chars=new int[1000];\
        for(int i=0; i<s.length(); ++i)\
            chars[s.charAt(i)]++;\
        int k=0;\
        for(int i=0; i<1000; ++i)\
        \{\
            int max=0, index=0;\
            for(int j=0; j<1000; ++j)\
                if(max<chars[j])\
                \{\
                    index=j;\
                    max=chars[j];\
                \}\
            while(chars[index]>0)\
            \{\
                ans[k++]=(char)(index);\
                chars[index]--;\
            \}\
        \}\
        return String.valueOf(ans);\
    \}\
\}}