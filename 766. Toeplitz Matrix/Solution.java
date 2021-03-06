{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean isToeplitzMatrix(int[][] matrix) \{\
        for(int i=0; i<matrix.length; ++i)\
        \{\
            int curr=matrix[i][0];\
            for(int j=1; i+j<matrix.length && j<matrix[i].length; ++j)\
                if(matrix[i+j][j]!=curr)\
                    return false;\
        \}\
        for(int i=0; i<matrix[0].length; ++i)\
        \{\
            int curr=matrix[0][i];\
            for(int j=1; i+j<matrix[0].length && j<matrix.length; ++j)\
                if(matrix[j][i+j]!=curr)\
                    return false;\
        \}\
        return true;\
    \}\
\}}