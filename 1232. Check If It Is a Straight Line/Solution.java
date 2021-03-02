{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean checkStraightLine(int[][] c) \{\
        int x=c[0][0], y=c[0][1];\
        boolean samex=true, samey=true;\
        for(int i=0; i<c.length; ++i)\
            if(c[i][0]!=x)\
            \{\
                samex=false;\
                break;\
            \}\
        for(int i=0; i<c.length; ++i)\
            if(c[i][1]!=y)\
            \{\
                samey=false;\
                break;\
            \}\
        if(samex || samey)\
            return true;\
        double a=(double)(c[1][1]-c[0][1])/(double)(c[1][0]-c[0][0]), b=c[0][1]-c[0][0]*a;\
        for(int i=2; i<c.length; ++i)\
            if(c[i][1]!=a*c[i][0]+b)\
                return false;\
        return true;\
    \}\
\}}