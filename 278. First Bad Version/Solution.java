{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /* The isBadVersion API is defined in the parent class VersionControl.\
      boolean isBadVersion(int version); */\
\
public class Solution extends VersionControl \{\
    public int firstBadVersion(int n) \{\
        int min=0, max=n, mid=0;\
        while(min<max)\
        \{\
            mid=(max-min)/2+min;\
            if(isBadVersion(mid)!=isBadVersion(mid+1))\
                break;\
            else if(isBadVersion(mid)==true)\
                max=mid;\
            else\
                min=mid;\
        \}\
        return mid+1;\
    \}\
\}}