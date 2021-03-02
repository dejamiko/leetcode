{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int minPathSum(int[][] grid) \{\
        for(int i=grid.length-2; i>=0; --i)\
            grid[i][grid[i].length-1]+=grid[i+1][grid[i].length-1];\
        for(int j=grid[grid.length-1].length-2; j>=0; --j)\
            grid[grid.length-1][j]+=grid[grid.length-1][j+1];\
        for(int i=grid.length-2; i>=0; --i)\
            for(int j=grid[i].length-2; j>=0; --j)\
                grid[i][j]+=Math.min(grid[i+1][j], grid[i][j+1]);\
        return grid[0][0];\
    \}\
\}}