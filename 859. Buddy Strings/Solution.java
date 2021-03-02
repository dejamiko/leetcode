{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean buddyStrings(String A, String B) \{\
        if(A.length()!=B.length())\
            return false;\
        int[] alph=new int[26];\
        char onea='A', twoa='A', oneb='B', twob='B';\
        boolean one=false, two=false;\
        for(int i=0; i<A.length(); ++i)\
        \{\
            alph[A.charAt(i)-'a']++;\
            if(A.charAt(i)!=B.charAt(i))\
            \{\
                if(!one && !two)\
                \{\
                    one=true;\
                    onea=A.charAt(i);\
                    oneb=B.charAt(i);\
                \}\
                else if(one && !two)\
                \{\
                    two=true;\
                    twoa=A.charAt(i);\
                    twob=B.charAt(i);\
                \}\
                else\
                    return false;\
            \}\
        \}\
        if(onea=='A')\
            for(int i=0; i<26; ++i)\
                if(alph[i]>1)\
                    return true;\
        return onea==twob && oneb==twoa;\
    \}\
\}}