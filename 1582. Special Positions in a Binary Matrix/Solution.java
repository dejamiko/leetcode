{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int numSpecial(int[][] mat) \{\
        int ans=0;\
        for(int i=0; i<mat.length; ++i)\
            for(int j=0; j<mat[i].length; ++j)\
                if(mat[i][j]==1)\
                \{\
                    boolean one=true;\
                    for(int k=0; one && k<mat[i].length; ++k)\
                        if(mat[i][k]==1 && j!=k)\
                            one=false;\
                    for(int k=0; one && k<mat.length; ++k)\
                       if(mat[k][j]==1 && i!=k)\
                            one=false;\
                    if(one)\
                        ans++;\
                \}\
        return ans;\
    \}\
\}}