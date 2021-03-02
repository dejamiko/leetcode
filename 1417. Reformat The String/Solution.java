{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String reformat(String s) \{\
        int[] l=new int[26];\
        int[] d=new int[10];\
        int dc=0, lc=0;\
        \
        for(int i=0; i<s.length(); ++i)\
        \{\
            if(s.charAt(i)>='a' && s.charAt(i)<='z')\
            \{\
                l[s.charAt(i)-'a']++;\
                lc++;\
            \}\
            else\
            \{\
                d[s.charAt(i)-'0']++;\
                dc++;\
            \}\
        \}\
        if(Math.abs(lc-dc)>1)\
            return "";\
        String ans="";\
        int j=0, k=0;\
        if(lc>dc)\
        \{\
            for(int i=0; i<s.length(); i+=2)\
            \{\
                while(j<25 && l[j]==0)\
                    j++;\
                ans+=(char)('a'+j);\
                l[j]--;\
                if(ans.length()==s.length())\
                    break;\
                while(k<9 && d[k]==0)\
                    k++;\
                d[k]--;\
                ans+=(char)('0'+k);\
            \}\
        \}\
        else\
        \{\
            for(int i=0; i<s.length(); i+=2)\
            \{\
                while(k<9 && d[k]==0)\
                    k++;\
                d[k]--;\
                ans+=(char)('0'+k);\
                if(ans.length()==s.length())\
                    break;\
                while(j<25 && l[j]==0)\
                    j++;\
                ans+=(char)('a'+j);\
                l[j]--;\
            \}\
        \}\
        return ans;\
    \}\
\}}