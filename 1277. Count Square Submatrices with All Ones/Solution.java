{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int countSquares(int[][] matrix) \{\
        int ans=0, n=matrix.length, m=matrix[0].length;\
        for(int k=1; k<=Math.min(m, n); ++k)\
            for(int i=0; i<n; ++i)\
                for(int j=0; j<m; ++j)\
                \{\
                    int temp=0, sum=0;\
                    for(int l=0; l<k && sum==temp; ++l)\
                        for(int h=0; h<k && sum==temp; ++h)\
                        \{\
                            sum++;\
                            if(n>i+l && m>j+h && matrix[i+l][j+h]==1)\
                                temp++;\
                        \}\
                    if(sum==temp)\
                        ans++;\
                \}\
        return ans;\
    \}\
\}}