{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[][] imageSmoother(int[][] M) \{\
        int[][] ans=new int[M.length][M[0].length];\
        for(int i=0; i<M.length; ++i)\
            for(int j=0; j<M[i].length; ++j)\
            \{\
                int s=0, t=0;\
                if(i>0)\
                \{\
                    if(j>0)\
                    \{\
                        s+=M[i-1][j-1];\
                        t++;\
                    \}\
                    s+=M[i-1][j];\
                    t++;\
                    if(j+1<M[i].length)\
                    \{\
                        s+=M[i-1][j+1];\
                        t++;\
                    \}\
                \}\
                if(j>0)\
                \{\
                    t++;\
                    s+=M[i][j-1];\
                \}\
                s+=M[i][j];\
                t++;\
                if(j+1<M[i].length)\
                \{\
                    s+=M[i][j+1];\
                    t++;\
                \}\
                if(i+1<M.length)\
                \{\
                    if(j>0)\
                    \{\
                        s+=M[i+1][j-1];\
                        t++;\
                    \}\
                    s+=M[i+1][j];\
                    t++;\
                    if(j+1<M[i].length)\
                    \{\
                        s+=M[i+1][j+1];\
                        t++;\
                    \}\
                \}\
                ans[i][j]=s/t;\
            \}\
        return ans;\
    \}\
\}}