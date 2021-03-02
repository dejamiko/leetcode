{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public void rotate(int[][] matrix) \{\
        int n=matrix.length;\
        for(int i=0; i<(n+1)/2; ++i)\
            for(int j=0; j<n/2; ++j)\
            \{\
                int temp=matrix[n-1-j][i];\
                matrix[n-1-j][i]=matrix[n-1-i][n-j-1];\
                matrix[n-1-i][n-j-1]=matrix[j][n-1-i];\
                matrix[j][n-1-i]=matrix[i][j];\
                matrix[i][j]=temp;\
            \}\
    \}\
\}}