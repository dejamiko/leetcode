{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String dayOfTheWeek(int day, int month, int year) \{\
        //1 Jan 1971 is Friday\
        String[] week=\{"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"\};\
        int[] months=\{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31\};\
        int days=0;\
        for(int i=1971; i<year; ++i)\
            if((i%4==0 && i%100!=0) || i%400==0)\
                days+=366%7;\
            else\
                days+=365%7;\
        if(((year%4==0 && year%100!=0) || year%400==0) && month>2)\
            days++;\
        for(int i=0; i<month-1; ++i)\
            days+=(months[i])%7;\
        days+=day-1;\
        days%=7;\
        return week[days];\
    \}\
\}}