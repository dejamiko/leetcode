{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int countCharacters(String[] words, String chars) \{\
        int ans=0;\
        int[] c=new int[26];\
        for(int i=0; i<chars.length(); ++i)\
            c[chars.charAt(i)-'a']++;\
        for(int i=0; i<words.length; ++i)\
        \{\
            int[] t=c.clone();\
            boolean go=true;\
            for(int j=0; go && j<words[i].length(); ++j)\
            \{\
                t[words[i].charAt(j)-'a']--;\
                if(t[words[i].charAt(j)-'a']<0)\
                    go=false;\
            \}\
            if(go)\
                ans+=words[i].length();\
        \}\
        return ans;\
    \}\
\}}