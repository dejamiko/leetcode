{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String strWithout3a3b(int a, int b) \{\
        StringBuilder sb=new StringBuilder();\
        boolean preva=false, prevb=false, prevda=false, prevdb=false;\
        while(a>0 && b>0)\
        \{\
            if(a>b)\
            \{\
                if(!prevda)\
                \{\
                    sb.append("a");\
                    if(preva)\
                        prevda=true;\
                    else\
                        preva=true;\
                    prevdb=false;\
                    prevb=false;\
                    a--;\
                \}\
                else\
                \{\
                    sb.append("b");\
                    if(prevb)\
                        prevdb=true;\
                    else\
                        prevb=true;\
                    prevda=false;\
                    preva=false;\
                    b--;\
                \}\
            \}\
            else\
            \{\
                if(!prevdb)\
                \{\
                    sb.append("b");\
                    if(prevb)\
                        prevdb=true;\
                    else\
                        prevb=true;\
                    prevda=false;\
                    preva=false;\
                    b--;\
                \}\
                else\
                \{\
                    sb.append("a");\
                    if(preva)\
                        prevda=true;\
                    else\
                        preva=true;\
                    prevdb=false;\
                    prevb=false;\
                    a--;\
                \}\
            \}\
        \}\
        while(a>0 && !prevda)\
        \{\
            sb.append("a");\
            a--;\
            if(preva)\
                prevda=true;\
            else\
                preva=true;\
        \}\
        while(b>0 && !prevdb)\
        \{\
            sb.append("b");\
            b--;           \
            if(prevb)\
                prevdb=true;\
            else\
                prevb=true;\
        \}\
        return sb.toString();\
    \}\
\}}