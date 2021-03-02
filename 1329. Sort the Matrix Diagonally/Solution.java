{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[][] diagonalSort(int[][] mat) \{\
        for(int i=0; i<mat.length; ++i)\
        \{\
            int[] t=new int[Math.min(mat.length-i, mat[i].length)];\
            for(int j=0; j<t.length; ++j)\
                t[j]=mat[i+j][j];\
            Arrays.sort(t);\
            for(int j=0; j<t.length; ++j)\
                mat[i+j][j]=t[j];\
        \}\
        for(int i=0; i<mat[0].length; ++i)\
        \{\
            int[] t=new int[Math.min(mat[0].length-i, mat.length)];\
            for(int j=0; j<t.length; ++j)\
                t[j]=mat[j][j+i];\
            Arrays.sort(t);\
            for(int j=0; j<t.length; ++j)\
                mat[j][j+i]=t[j];\
        \}\
        return mat;\
    \}\
\}}