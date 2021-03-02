{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /**\
 * The rand7() API is already defined in the parent class SolBase.\
 * public int rand7();\
 * @return a random integer in the range 1 to 7\
 */\
class Solution extends SolBase \{\
    public int rand10() \{\
        int a=rand7(), b=rand7();\
        while(a>5)\
            a=rand7();\
        while(b==4)\
            b=rand7();\
        if(b<4)\
            return a;\
        else\
            return a+5;\
    \}\
\}}