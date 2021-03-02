{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String intToRoman(int num) \{\
        int[] arabic=\{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1\};\
        String[] roman=\{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"\};\
        String ans="";\
        int i=0;\
        while(num>0)\
        \{\
            while(num>=arabic[i])\
            \{\
                ans+=roman[i];\
                num-=arabic[i];\
            \}\
            i++;\
        \}\
        return ans;\
    \}\
\}}