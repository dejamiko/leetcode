{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int maxIncreaseKeepingSkyline(int[][] grid) \{\
        int size=grid.length, ans=0;\
        int topbottom[]=new int[size];\
        int leftright[]=new int[size];\
        for(int i=0; i<size; ++i)\
            for(int j=0; j<size; ++j)\
            \{\
                topbottom[i]=Math.max(topbottom[i], grid[i][j]);\
                leftright[j]=Math.max(leftright[j], grid[i][j]);\
            \}\
        for(int i=0; i<size; ++i)\
            for(int j=0; j<size; ++j)\
            \{\
                ans+=Math.min(topbottom[i], leftright[j])-grid[i][j];\
            \}\
        return ans;\
    \}\
\}}