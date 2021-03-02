{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean checkIfExist(int[] arr) \{\
        Arrays.sort(arr);\
        for(int i=0; i<arr.length; ++i)\
        \{\
            for(int j=i+1; j<arr.length; ++j)\
                if(arr[j]==arr[i]*2 || arr[j]*2==arr[i])\
                    return true;\
        \}\
        return false;\
    \}\
\}}