{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int findMinDifference(List<String> timePoints) \{\
        int[] time=new int[timePoints.size()];\
        for(int i=0; i<timePoints.size(); ++i)\
        \{\
            char[] c=timePoints.get(i).toCharArray();\
            time[i]=(c[0]-'0')*600+(c[1]-'0')*60+(c[3]-'0')*10+(c[4]-'0');\
        \}\
        int min=Integer.MAX_VALUE;\
        for(int i=0; i<time.length; ++i)\
            for(int j=i+1; j<time.length; ++j)\
                min=Math.min(min, Math.min(Math.abs(time[i]-time[j]), Math.min(Math.abs(1440-time[i]+time[j]), Math.abs(1440-time[j]+time[i]))));\
        return min;\
    \}\
\}}