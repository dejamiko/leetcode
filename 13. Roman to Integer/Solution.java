{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int romanToInt(String s) \{\
        int[] arabic=\{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1\};\
        String[] roman=\{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"\};\
        int ans=0;\
        for(int i=0; i<s.length(); ++i)\
        \{\
            if(i+1<s.length() && s.charAt(i)=='C' && s.charAt(i+1)=='M')\
            \{\
                ans+=900;\
                i++;\
                continue;\
            \}\
            if(i+1<s.length() && s.charAt(i)=='C' && s.charAt(i+1)=='D')\
            \{\
                ans+=400;\
                i++;\
                continue;\
            \}\
            if(i+1<s.length() && s.charAt(i)=='X' && s.charAt(i+1)=='C')\
            \{\
                ans+=90;\
                i++;\
                continue;\
            \}\
            if(i+1<s.length() && s.charAt(i)=='X' && s.charAt(i+1)=='L')\
            \{\
                ans+=40;\
                i++;\
                continue;\
            \}\
            if(i+1<s.length() && s.charAt(i)=='I' && s.charAt(i+1)=='X')\
            \{\
                ans+=9;\
                i++;\
                continue;\
            \}\
            if(i+1<s.length() && s.charAt(i)=='I' && s.charAt(i+1)=='V')\
            \{\
                ans+=4;\
                i++;\
                continue;\
            \}\
            switch(s.charAt(i))\
            \{\
                case 'M':\
                    ans+=1000;\
                    break;\
                    \
                case 'D':\
                    ans+=500;\
                    break;\
\
                case 'C':\
                    ans+=100;\
                    break;\
\
                case 'L':\
                    ans+=50;\
                    break;\
\
                case 'X':\
                    ans+=10;\
                    break;\
\
                case 'V':\
                    ans+=5;\
                    break;\
\
                case 'I':\
                    ans+=1;\
                    break;\
            \}\
        \}\
        return ans;\
    \}\
\}}