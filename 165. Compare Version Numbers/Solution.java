{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int compareVersion(String version1, String version2) \{\
        String[] a=version1.split("\\\\.");\
        String[] b=version2.split("\\\\.");\
        for(int i=0; i<Math.max(a.length, b.length); ++i)\
        \{\
            if(a.length<=i)\
            \{\
                for(int j=i; j<b.length; ++j)\
                    if(Integer.parseInt(b[i])>0)\
                        return -1;\
            \}\
            else if(b.length<=i)\
            \{\
                for(int j=i; j<a.length; ++j)\
                    if(Integer.parseInt(a[i])>0)\
                        return 1;\
            \}\
            else if(Integer.parseInt(a[i])>Integer.parseInt(b[i]))\
                return 1;\
            else if(Integer.parseInt(a[i])<Integer.parseInt(b[i]))\
                return -1;\
        \}\
        return 0;\
    \}\
\}}