{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int oddCells(int n, int m, int[][] indices) \{\
        int[][] matrix=new int[n][m];\
        for(int i=0; i<n; ++i)\
            for(int j=0; j<m; ++j)\
                matrix[i][j]=0;\
        int ans=0;\
        for(int k=0; k<indices.length; ++k)\
        \{\
            for(int i=0; i<n; ++i)\
                matrix[i][indices[k][1]]++;\
            for(int j=0; j<m; ++j)\
                matrix[indices[k][0]][j]++;\
        \}\
        for(int i=0; i<n; ++i)\
            for(int j=0; j<m; ++j)\
                if(matrix[i][j]%2==1)\
                    ans++;\
        return ans;\
    \}\
\}}