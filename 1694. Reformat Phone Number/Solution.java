{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String reformatNumber(String number) \{\
        number=number.replaceAll("[^0-9]", "");\
        if(number.length()<3)\
            return number;\
        StringBuilder sb=new StringBuilder();\
        int k=0, r=number.length()%3;\
        for(int i=0; i<number.length()-3-number.length()%3; ++i)\
        \{\
            sb.append(number.charAt(i));\
            k++;\
            if(k==3)\
            \{\
                sb.append("-");\
                k=0;\
            \}\
        \}\
        if(r==0)\
            sb.append(number.substring(number.length()-3, number.length()));\
        else if(r==2)\
        \{\
            sb.append(number.substring(number.length()-5, number.length()-2));\
            sb.append("-");\
            sb.append(number.substring(number.length()-2, number.length()));\
        \}\
        else\
        \{\
            sb.append(number.substring(number.length()-4, number.length()-2));\
            sb.append("-");\
            sb.append(number.substring(number.length()-2, number.length()));\
        \}\
        return sb.toString();\
    \}\
\}}