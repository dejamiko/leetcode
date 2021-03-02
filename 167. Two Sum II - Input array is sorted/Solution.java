{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] twoSum(int[] numbers, int target) \{\
        int l=0, r=numbers.length-1;\
        while(l<r)\
        \{\
            if(numbers[l]+numbers[r]>target)\
                r--;\
            else if(numbers[l]+numbers[r]<target)\
                l++;\
            else\
                return new int[]\{l+1, r+1\};\
        \}\
        return new int[]\{-1, -1\};\
    \}\
\}}